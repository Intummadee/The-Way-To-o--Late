package main;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.text.DecimalFormat;
import object.OBJ_Heart;
import object.SuperObject;

public class UI {

    GamePanel gp;
    Graphics2D g2;
    Font eightBitDragon;
    Font dialogueFont;
    BufferedImage heart_full, heart_blank;
    SuperObject goalObject;
    public boolean messageOn = false;
    public String messageDamage = "";
    int messageCounter = 0;
    public boolean gameFinished = false;
    double playTime;
    DecimalFormat dFormat = new DecimalFormat("#0.00");
    public int commandNum = 0;
    public int pauseCommandNum = 0;


    public boolean monologueOn = false;
    public String monologueText = "";
    int monologueCounter = 0;
    int monologueDuration = 180; // 3 วินาที ถ้าเกม 60 FPS


    public void showMonologue(String text) {
        monologueText = text;
        monologueOn = true;
        monologueCounter = 0;
    }

    public void drawMonologue() {
        if (monologueOn == true) {
            g2.setFont(dialogueFont.deriveFont(Font.BOLD, 18F));

            int textWidth = (int) g2.getFontMetrics().getStringBounds(monologueText, g2).getWidth();
            int boxWidth = Math.min(Math.max(textWidth + 36, 260), gp.screenWidth - gp.tileSize * 2);
            int boxHeight = 54;
            int x = gp.player.screenX + gp.tileSize / 2 - boxWidth / 2;
            int y = gp.player.screenY - boxHeight - 14;

            if (x < gp.tileSize / 2) {
                x = gp.tileSize / 2;
            }
            if (x + boxWidth > gp.screenWidth - gp.tileSize / 2) {
                x = gp.screenWidth - gp.tileSize / 2 - boxWidth;
            }
            if (y < gp.tileSize) {
                y = gp.player.screenY + gp.tileSize + 12;
            }

            g2.setColor(new Color(255, 255, 255, 235));
            g2.fillRoundRect(x, y, boxWidth, boxHeight, 14, 14);
            g2.setColor(new Color(45, 45, 45, 230));
            g2.drawRoundRect(x, y, boxWidth, boxHeight, 14, 14);

            int tailX = gp.player.screenX + gp.tileSize / 2;
            int tailY = y + boxHeight;
            int[] xPoints = {tailX - 8, tailX + 8, tailX};
            int[] yPoints = {tailY - 1, tailY - 1, tailY + 12};
            g2.setColor(new Color(255, 255, 255, 235));
            g2.fillPolygon(xPoints, yPoints, 3);
            g2.setColor(new Color(45, 45, 45, 230));
            g2.drawPolygon(xPoints, yPoints, 3);

            g2.setColor(new Color(25, 25, 25));
            g2.drawString(monologueText, x + 18, y + 34);

            monologueCounter++;

            if (monologueCounter > monologueDuration) {
                monologueCounter = 0;
                monologueOn = false;
            }
        }
    }


    public UI(GamePanel gp) {
        this.gp = gp;
        
        try {
            InputStream is = getClass().getResourceAsStream("/font/EightBitDragon-anqx.ttf");
            eightBitDragon = Font.createFont(Font.TRUETYPE_FONT, is);
        } catch (FontFormatException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        dialogueFont = new Font("Tahoma", Font.PLAIN, 18);

        // Create heart object
        SuperObject heart = new OBJ_Heart(gp);
        heart_full = heart.image;
        heart_blank = heart.image2;

    }

    public void showMessage(String text) {
        messageDamage = text;
        messageOn = true;
    }

    public void resetPlayTime() {
        playTime = 0;
    }

    public void draw(Graphics2D g2) {

        this.g2 = g2;
        g2.setFont(this.eightBitDragon);
        g2.setColor(Color.WHITE);

        if (gp.gameState == gp.titleState) {
            drawTitleScreen();
        }

        // Play State
        if (gp.gameState == gp.playState) {
            drawPlayerLife();

            if (gameFinished == true) {

                String text;
                int textLength;
                int x, y;
                g2.setColor(new Color(0, 0, 0, 180));
                g2.fillRect(0, 0, gp.screenWidth, gp.screenHeight);
                g2.setFont(this.eightBitDragon.deriveFont(30F));
                text = "Can go to the exam";
                g2.setColor(Color.white);
                textLength = (int) g2.getFontMetrics().getStringBounds(text, g2).getWidth(); // return length of text
                x = gp.screenWidth / 2 - textLength / 2;
                y = gp.screenHeight / 2;
                g2.drawString(text, x, y);

                g2.setFont(this.eightBitDragon.deriveFont(30F));
                text = "Your time is : " + dFormat.format(playTime);
                g2.setColor(Color.white);
                textLength = (int) g2.getFontMetrics().getStringBounds(text, g2).getWidth();
                x = gp.screenWidth / 2 - textLength / 2;
                y = gp.screenHeight / 2 - (gp.tileSize * 3);
                g2.drawString(text, x, y);

                g2.setFont(this.eightBitDragon.deriveFont(30F));
                text = "Your score is : " + dFormat.format(((90 - playTime) * 100) + (gp.player.life) * 100);
                textLength = (int) g2.getFontMetrics().getStringBounds(text, g2).getWidth();
                x = gp.screenWidth / 2 - textLength / 2;
                y = gp.screenHeight / 2 - (gp.tileSize * 2);
                g2.drawString(text, x, y);

                g2.setFont(this.eightBitDragon.deriveFont(45F));
                g2.setColor(Color.ORANGE);
                text = "Congratulations!";
                textLength = (int) g2.getFontMetrics().getStringBounds(text, g2).getWidth(); // return length of text
                x = gp.screenWidth / 2 - textLength / 2;
                y = gp.screenHeight / 2 + (gp.tileSize * 2); // move text below three tiles.
                g2.drawString(text, x, y);

                g2.setFont(this.eightBitDragon.deriveFont(25F));
                text = ">  Quit";
                g2.setColor(Color.white);
                x = getXforCenteredText(text);
                y = gp.screenHeight / 2 + 200;
                g2.drawString(text, x, y);

//                gp.gameThread = null;
            } // game dosen't end
            else {

                //Time
                playTime += (double) 1 / 60;
                double remainingTime = 90 - playTime;
                g2.setFont(this.eightBitDragon.deriveFont(23F));
                if (remainingTime >= 0) {
                    g2.setColor(Color.WHITE);
                    g2.drawString("Time : " + dFormat.format(remainingTime), gp.tileSize * 12, 50);
                } else {
                    g2.setColor(Color.ORANGE);
                    g2.drawString("Late : +" + dFormat.format(Math.abs(remainingTime)), gp.tileSize * 12, 50);
                }
                drawGoalArrow();

                // Message 
                if (messageOn == true) {
                    g2.setFont(this.eightBitDragon.deriveFont(20F)); // change font for messageDamage especially s

                    int x = getXforCenteredText(messageDamage);
                    int y = gp.screenHeight / 2;

                    g2.drawString(messageDamage, x + 35, y - 24);
                    messageCounter++;

                    // 2 seconds
                    if (messageCounter > 60) {
                        messageCounter = 0;
                        messageOn = false;
                    }
                }
            }
            drawMonologue();
        }

        // Pause State
        if (gp.gameState == gp.pauseState) {
            drawPlayerLife();
            drawPauseScreen();
        }
        // Game over
        if (gp.gameState == gp.gameOverState) {
            drawGameOverScreen();
        }

//       
    }

    private SuperObject getGoalObject() {
        if (goalObject != null) { return goalObject; } // ถ้าเคยหาเจอแล้ว ให้ส่งค่ากลับไปเลย (ไม่ต้องหาซ้ำให้เปลืองแรงเครื่อง)
    
        for (SuperObject object : gp.obj) { // วนลูปตรวจเช็ควัตถุทั้งหมดที่มีอยู่ในเกมขณะนั้น
            if (object != null && "end".equals(object.name)) { // ถ้าเจอวัตถุที่ชื่อว่า "end" (ห้องสอบ)
                goalObject = object; // บันทึกเก็บไว้ในตัวแปร
                return goalObject; // ส่งค่านั้นกลับไปใช้งาน
            }
        }
        return null; // ถ้าในด่านนั้นยังไม่ได้วางจุดจบเกม จะส่งค่าความว่างเปล่ากลับไป
    }

    public void drawGoalArrow() {
        SuperObject goal = getGoalObject();
        if (goal == null) {
            return;
        }

        int playerCenterX = gp.player.worldX + gp.tileSize / 2; // หาจุดกึ่งกลางตัวผู้เล่น
        int playerCenterY = gp.player.worldY + gp.tileSize / 2;
        int goalCenterX = goal.worldX + gp.tileSize / 2;       // หาจุดกึ่งกลางของห้องสอบ
        int goalCenterY = goal.worldY + gp.tileSize / 2;

        double dx = goalCenterX - playerCenterX; // หาความต่างของระยะทางแนวนอน (Delta X)
        double dy = goalCenterY - playerCenterY; // หาความต่างของระยะทางแนวตั้ง (Delta Y)

        double angle = Math.atan2(dy, dx); // ใช้สูตรตรีโกณมิติ (Arc Tangent) เพื่อคำนวณหา "องศา/มุม" ที่ลูกศรต้องหมุนชี้ไป
        int distanceTiles = (int) Math.round(Math.sqrt(dx * dx + dy * dy) / gp.tileSize); // ใช้ทฤษฎีพีทาโกรัสหาเส้นทแยงมุม แล้วหารด้วยขนาดบล็อกเพื่อแปลงค่าเป็นจำนวนช่อง (Tiles)

        
        int x = gp.screenWidth - gp.tileSize - 18; // ตั้งพิกัดหน้าจอที่จะใช้วาด (มุมขวาล่าง)
        int y = gp.screenHeight - gp.tileSize - 38;
        int radius = 28; // รัศมีวงกลม

        AffineTransform oldTransform = g2.getTransform(); // จดจำมุมกล้องปกติของหน้าจอไว้ก่อน
        java.awt.Stroke oldStroke = g2.getStroke();
        Font oldFont = g2.getFont();

        g2.setColor(new Color(0, 0, 0, 145));
        g2.fillOval(x - radius, y - radius, radius * 2, radius * 2);
        g2.setColor(new Color(255, 255, 255, 210));
        g2.setStroke(new BasicStroke(2));
        g2.drawOval(x - radius, y - radius, radius * 2, radius * 2);

        g2.translate(x, y); // ย้ายจุดศูนย์กลางพู่กันไปที่ตำแหน่งวงกลม
        g2.rotate(angle);   // หมุนพู่กันไปตามองศาที่คำนวณได้จากสูตรตรีโกณมิติด้านบน

        Polygon arrow = new Polygon();
        arrow.addPoint(22, 0);
        arrow.addPoint(-12, -13);
        arrow.addPoint(-5, 0);
        arrow.addPoint(-12, 13);

        g2.setColor(new Color(255, 196, 53));
        g2.fillPolygon(arrow);
        g2.setColor(new Color(45, 45, 45));
        g2.drawPolygon(arrow);

        g2.setTransform(oldTransform);
        g2.setStroke(oldStroke);

        g2.setFont(dialogueFont.deriveFont(Font.BOLD, 13F));
        String distanceText = distanceTiles + " tiles"; // ข้อความที่จะแสดง
        int textWidth = (int) g2.getFontMetrics().getStringBounds(distanceText, g2).getWidth();
        g2.setColor(new Color(0, 0, 0, 145));
        g2.fillRoundRect(x - textWidth / 2 - 8, y + radius + 5, textWidth + 16, 22, 8, 8);
        g2.setColor(Color.WHITE);
        g2.drawString(distanceText, x - textWidth / 2, y + radius + 21);

        g2.setFont(oldFont);
    }

    public void drawTitleScreen() {
        g2.setColor(new Color(70, 120, 80));
        g2.fillRect(0, 0, gp.screenWidth, gp.screenHeight);

        //TITLE NAME
        g2.setFont(this.eightBitDragon.deriveFont(45F));
        String txt = "Way To (o) Late";
        int x = getXforCenteredText(txt);
        int y = gp.tileSize * 3;
        //SHADOW
        g2.setColor(Color.black);
        g2.drawString(txt, x + 3, y + 4);
        //MAIN COLOR
        g2.setColor(Color.white);
        g2.drawString(txt, x, y);

        //CHARACTER IMG
        x = (int) (gp.screenWidth / 2.3);
        y += gp.tileSize * 1;
        g2.drawImage(gp.player.down1, x, y, gp.tileSize * 2, gp.tileSize * 2, null);

        //MENU
        g2.setFont(this.eightBitDragon.deriveFont(32F));

        //Play game
        txt = "Play Game";
        x = getXforCenteredText(txt);
        y += gp.tileSize * 4;
        g2.drawString(txt, x, y);
        if (commandNum == 0) {
            g2.drawString(">", x - gp.tileSize, y);
        }
        //Quit
        txt = "Quit";
        x = getXforCenteredText(txt);
        y += gp.tileSize * 1.5;
        g2.drawString(txt, x, y);
        if (commandNum == 1) {
            g2.drawString(">", x - gp.tileSize, y);
        }

    }

    // heart
    public void drawPlayerLife() {
        int x = gp.tileSize / 2;
        int y = gp.tileSize / 2;
        int i = 0;

        // draw blank heart
        while (i < gp.player.maxLife) {
            g2.drawImage(heart_blank, x, y, null);
            i++;
            x += gp.tileSize;
        }

        // reset
        x = gp.tileSize / 2;
        y = gp.tileSize / 2;
        i = 0;

        // draw current life
        while (i < gp.player.life) {
            g2.drawImage(heart_full, x, y, null);
            i++;
            x += gp.tileSize;
        }

        if (gp.player.life == 0) {
//            gp.ui.gameFinished = true;
        }

    }

    // screen that pause time
    public void drawPauseScreen() {
        g2.setColor(new Color(0, 0, 0, 180)); // วาดฉากหลังสีดำโปร่งแสง
        g2.fillRect(0, 0, gp.screenWidth, gp.screenHeight); // วาดสี่เหลี่ยมทึบ (ตั้งแต่พิกัด 0,0 ไปจนถึงความกว้างและความสูงสุดของจอ)

        g2.setColor(Color.white);
        g2.setFont(this.eightBitDragon.deriveFont(45F));
        String text = "Pause";
        int x = getXforCenteredText(text);
        int y = gp.tileSize * 4; // ตั้งพิกัดแนวตั้ง Y ให้อยู่ห่างจากขอบบนลงมาเท่ากับขนาด 4 บล็อกของเกม (Tile Size)
        g2.drawString(text, x, y);

        g2.setFont(this.eightBitDragon.deriveFont(28F));

        // เมนู Resume
        text = "Resume";
        x = getXforCenteredText(text);
        y += gp.tileSize * 2;          // ขยับพิกัด Y ลงมาด้านล่าง
        g2.drawString(text, x, y);     // วาดคำว่า Resume
        if (pauseCommandNum == 0) {    // ถ้าผู้เล่นเลือกเมนูที่ 0 (Resume)
            g2.drawString(">", x - gp.tileSize, y); // วาดลูกศรด้านหน้าข้อความ
        }

        // เมนู Restart
        text = "Restart";
        x = getXforCenteredText(text);
        y += gp.tileSize;              // ขยับ Y ลงมาอีก 1 บล็อก
        g2.drawString(text, x, y);     // วาดคำว่า Restart
        if (pauseCommandNum == 1) {    // ถ้าผู้เล่นเลือกเมนูที่ 1 (Restart)
            g2.drawString(">", x - gp.tileSize, y);
        }

        // เมนู Quit
        text = "Quit";
        x = getXforCenteredText(text);
        y += gp.tileSize;              // ขยับ Y ลงมาอีก 1 บล็อก
        g2.drawString(text, x, y);     // วาดคำว่า Quit
        if (pauseCommandNum == 2) {    // ถ้าผู้เล่นเลือกเมนูที่ 2 (Quit)
            g2.drawString(">", x - gp.tileSize, y);
        }
    }

    public int getXforCenteredText(String text) {
        // ฟังก์ชันคำนวณหาพิกัด X เพื่อให้ข้อความอยู่ กึ่งกลางหน้าจอ พอดี
        int textLength = (int) g2.getFontMetrics().getStringBounds(text, g2).getWidth();
        int x = gp.screenWidth / 2 - textLength / 2;
        return x;
    }

    public void drawGameOverScreen() {

        g2.setColor(new Color(0, 0, 0, 180));
        g2.fillRect(0, 0, gp.screenWidth, gp.screenHeight);

        int x;
        int y;
        String text;
        g2.setFont(this.eightBitDragon.deriveFont(Font.BOLD, 45f));
        text = "Game Over";
        // shadow
        g2.setColor(Color.black);
        x = getXforCenteredText(text);
        y = gp.tileSize * 4;
        g2.drawString(text, x, y);
        // main
        g2.setColor(Color.white);
        g2.drawString(text, x, y - 4);
        // why u game over
        g2.setFont(this.eightBitDragon.deriveFont(Font.BOLD, 32f));
        if (gp.player.life <= 0) {
            text = "Unfortunately, you died. RIP";

        } else {
            text = "Too bad, you're late";
        }
        x = getXforCenteredText(text);
        y += gp.tileSize * 2;
        g2.drawString(text, x, y);

        playTime = 0;

        // retry
        g2.setFont(this.eightBitDragon.deriveFont(30f));
        text = "Retry";
        x = getXforCenteredText(text);
        y += gp.tileSize * 3;
        g2.drawString(text, x, y);
        if (commandNum == 0) {
            g2.drawString(">", x - gp.tileSize, y);
        }

        // back to title screen
        text = "Quit";
        x = getXforCenteredText(text);
        y += 55;
        g2.drawString(text, x, y);
        if (commandNum == 1) {
            g2.drawString(">", x - gp.tileSize, y);
        }
    }

}
