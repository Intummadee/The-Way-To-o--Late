package entity;

import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.*;
import javax.imageio.ImageIO;

import main.GamePanel;
import main.KeyHandler;

public class Player extends Entity {

    KeyHandler keyH;

    public final int screenX;
    public final int screenY;

    public Player(GamePanel gp, KeyHandler keyH) {

        super(gp);  // call constructor of superclass by passing this gp
        this.keyH = keyH;

        screenX = gp.screenWidth / 2 - (gp.tileSize / 2);
        screenY = gp.screenHeight / 2 - (gp.tileSize / 2);

        solidArea = new Rectangle();
        solidArea.x = 8;
        solidArea.y = 8;
        solidAreaDefaultX = solidArea.x;
        solidAreaDefaultY = solidArea.y;
        solidArea.width = 16;
        solidArea.height = 32;

        setDefaultValues();
        getPlayerImage();

    }

    public void setDefaultValues() {

        worldX = gp.tileSize * 12;
        worldY = gp.tileSize * 10;
        speed = 3;
        direction = "down";

        // Player status
        maxLife = 5;
        life = maxLife;

    }

    public void getPlayerImage() {
        up1 = setUp("/player/boyup1");
        up2 = setUp("/player/boyup2");
        up3 = setUp("/player/boyup3");
        up4 = setUp("/player/boyup4");
        down1 = setUp("/player/boydown1");
        down2 = setUp("/player/boydown2");
        down3 = setUp("/player/boydown3");
        down4 = setUp("/player/boydown4");
        left1 = setUp("/player/boyleft1");
        left2 = setUp("/player/boyleft2");
        left3 = setUp("/player/boyleft3");
        left4 = setUp("/player/boyleft4");
        right1 = setUp("/player/boyright1");
        right2 = setUp("/player/boyright2");
        right3 = setUp("/player/boyright3");
        right4 = setUp("/player/boyright4");
    }

    public void setDefaultPositions() {

        worldX = gp.tileSize * 12;
        worldY = gp.tileSize * 10;
        direction = "down";

    }

    public void restoreLife() {

        life = maxLife;
        invincible = false;
    }

    public void update() {

        if (keyH.upPressed == true || keyH.downPressed == true
                || keyH.leftPressed == true || keyH.rightPressed == true) {
            if (keyH.upPressed == true) {
                direction = "up";
            } else if (keyH.downPressed == true) {
                direction = "down";
            } else if (keyH.leftPressed == true) {
                direction = "left";
            } else if (keyH.rightPressed == true) {
                direction = "right";
            }

            // Check Tile collision
            collisionOn = false;
            gp.cChecker.checkTile(this);

            // Check Object collision
            int objIndex = gp.cChecker.checkObject(this, true); // this player class as an entity
            stepEunji(objIndex);

            // Check event
            gp.eHandler.checkEvent();

            // check NPC collision
            int npcIndex = gp.cChecker.checkEntity(this, gp.npc);
            interactNPC(npcIndex);

            // if collision is false , player can move
            if (collisionOn == false) {
                switch (direction) {
                    case "up":
                        worldY -= speed;
                        break;
                    case "down":
                        worldY += speed;
                        break;
                    case "left":
                        worldX -= speed;
                        break;
                    case "right":
                        worldX += speed;
                        break;
                }
            }

            spriteCounter++;

            if (spriteCounter > 10) {
                if (spriteNum == 1) {
                    spriteNum = 2;

                } else if (spriteNum == 2) {
                    spriteNum = 3;
                } else if (spriteNum == 3) {
                    spriteNum = 4;
                } else if (spriteNum == 4) {
                    spriteNum = 1;
                }
                spriteCounter = 0;
            }

        }

        if (invincible == true) {
            invincibleCounter++;
            if (invincibleCounter > 60) {
                invincible = false;
                invincibleCounter = 0;
            }
        }
        if (life <= 0) {
            gp.gameState = gp.gameOverState;
        }

    }

    public void stepEunji(int i) {
        // if index != 999 -> we touch Eunji
        if (i != 999) {
            String objectName = gp.obj[i].name; // input name of OBJ_ class

            switch (objectName) {
                case "Eunji":
                    gp.obj[i] = null; // it will be delete object , if we step Eunji
                    //gp.playSE(3);
                    gp.ui.showMessage("hp: -1");
                    gp.player.life -= 1;
                    break;
                case "Egg":
                    if (gp.player.life < 5) {
                        gp.player.life += 1;
                    }
                    gp.ui.showMessage("hp: +1");
                    gp.obj[i] = null;
                    // gp.playSE(3);
                    break;
                case "end":
                    gp.ui.gameFinished = true;
                    gp.stopMusic();
                    gp.playSE(1);
   
                    break;
                case "walk":
                    break;
                case "water":
//                        gp.obj[i] = null;
//                        gp.ui.showMessage("-1");
//                        gp.player.life -= 1;
                    break;
                default:
                    collisionOn = true;
//                    System.out.println("collision");

            }
        }
    }

    public void draw(Graphics2D g2) {

//		g2.setColor(Color.white);
//		g2.fillRect(x, y, gp.tileSize, gp.tileSize);
        BufferedImage image = null;

        switch (direction) {
            case "up":
                if (spriteNum == 1) {
                    image = up1;

                }
                if (spriteNum == 2) {
                    image = up2;
                }
                if (spriteNum == 3) {
                    image = up3;

                }
                if (spriteNum == 4) {
                    image = up4;
                }
                break;
            case "down":
                if (spriteNum == 1) {
                    image = down1;

                }
                if (spriteNum == 2) {
                    image = down2;
                }
                if (spriteNum == 3) {
                    image = down3;

                }
                if (spriteNum == 4) {
                    image = down4;
                }
                break;
            case "left":
                if (spriteNum == 1) {
                    image = left1;

                }
                if (spriteNum == 2) {
                    image = left2;
                }
                if (spriteNum == 3) {
                    image = left3;

                }
                if (spriteNum == 4) {
                    image = left4;
                }
                break;
            case "right":
                if (spriteNum == 1) {
                    image = right1;

                }
                if (spriteNum == 2) {
                    image = right2;
                }
                if (spriteNum == 3) {
                    image = right3;

                }
                if (spriteNum == 4) {
                    image = right4;
                }
                break;

        }

        // set opacity of player 
        if (invincible == true) {
            g2.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 0.3f)); // opacity 70 %
        }

        g2.drawImage(image, screenX, screenY, gp.tileSize, gp.tileSize, null);

        // reset opacity 100%
        g2.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 1f));

    }

    public void interactNPC(int i) {
        if (i != 999) {
            if (gp.npc[i].type != 3) {
                // npc 
                if (invincible == false) {
                    life -= 1;
                    gp.ui.showMessage("nom");
                    invincible = true;
                }
            } else {
                // car
                life = 0;
            }
        }

    }

}
