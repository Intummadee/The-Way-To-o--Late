package main;

import java.awt.Rectangle;

public class EventHandler {

    GamePanel gp;
    EventRect eventRect[][];

    int previousEventX, previousEventY;
    boolean canTouchEvent = true;

    public EventHandler(GamePanel gp) {
        this.gp = gp;

        eventRect = new EventRect[gp.maxWorldCol][gp.maxWorldRow];

        int col = 0;
        int row = 0;
        while (col < gp.maxWorldCol && row < gp.maxWorldRow) {

            eventRect[col][row] = new EventRect();
            eventRect[col][row].x = 10;
            eventRect[col][row].y = 10;
            eventRect[col][row].width = 28;
            eventRect[col][row].height = 28;
            eventRect[col][row].eventRectDefaultX = eventRect[col][row].x;
            eventRect[col][row].eventRectDefaultY = eventRect[col][row].y;
            col++; // end loop
            if (col == gp.maxWorldCol) {
                col = 0;
                row++;
            }

        }

    }

    public void checkEvent() {
        // check if player is more than 1 tile(distance > gp.tileSize) away from the last event
        int xDistance = Math.abs(gp.player.worldX - previousEventX);
        int yDistance = Math.abs(gp.player.worldY - previousEventY);
        int distance = Math.max(xDistance, yDistance);
        if (distance > gp.tileSize) {
            // player must move away before it will be damagePit agian
            canTouchEvent = true;
        }

        if (canTouchEvent == true) {

            if (hit(13, 15) == true) {
                damagePit(13, 15);
            }
            if (hit(12, 17) == true) {
                damagePit(12, 17);
            }
            if (hit(12, 18) == true) {
                damagePit(12, 18);
            }
            if (hit(13, 18) == true) {
                damagePit(13, 18);
            }
            if (hit(13, 19) == true) {
                damagePit(13, 19);
            }
            if (hit(12, 33) == true) {
                damagePit(12, 33);
            }
            if (hit(12, 34) == true) {
                damagePit(12, 34);
            }
            if (hit(12, 35) == true) {
                damagePit(12, 35);
            }
            if (hit(12, 36) == true) {
                damagePit(12, 36);
            }
            if (hit(12, 40) == true) {
                damagePit(12, 40);
            }
            if (hit(12, 41) == true) {
                damagePit(12, 41);
            }
            if (hit(12, 42) == true) {
                damagePit(12, 42);
            }
            if (hit(13, 41) == true) {
                damagePit(13, 41);
            }
            if (hit(13, 42) == true) {
                damagePit(13, 42);
            }
            if (hit(31, 19) == true) {
                damagePit(31, 19);
            }
            if (hit(31, 20) == true) {
                damagePit(31, 20);
            }
            if (hit(30, 20) == true) {
                damagePit(30, 20);
            }
            if (hit(14, 34) == true) {
                damagePit(30, 34);
            }
            if (hit(32, 28) == true) {
                damagePit(32, 28);
            }
            if (hit(31, 31) == true) {
                damagePit(31, 31);
            }
            if (hit(38, 36) == true) {
                damagePit(32, 28);
            }
            if (hit(38, 37) == true) {
                damagePit(31, 31);
            }
            if (hit(39, 36) == true) {
                damagePit(39, 36);
            }
            if (hit(81, 51) == true) {
                damagePit(81, 51);
            }
            if (hit(81, 53) == true) {
                damagePit(81, 53);
            }
            if (hit(81, 56) == true) {
                damagePit(81, 56);
            }
            for (int nub = 0; nub < 3; nub++) {
                if (hit(13, 15) == true) {
                    damagePit(80, (52 + nub));
                }
            }
            if (hit(13, 19) == true) {
                damagePit(81, 57);
            }
            if (hit(13, 19) == true) {
                damagePit(80, 59);
            }
            for (int nub = 0; nub < 3; nub++) {
                if (hit((83 + nub), 66) == true) {
                    damagePit((83 + nub), 66);
                }
            }
            for (int nub = 0; nub < 6; nub++) {
                if (hit((81 + nub), 67) == true) {
                    damagePit((81 + nub), 67);
                }
            }
            for (int nub = 0; nub < 2; nub++) {
                if (hit((80 + (nub * 4)), 68) == true) {
                    damagePit((80 + (nub * 4)), 68);
                }
            }
            for (int nub = 0; nub < 2; nub++) {
                if (hit(82, (79 + nub)) == true) {
                    damagePit(82, (79 + nub));
                }
            }
            for (int nub = 0; nub < 4; nub++) {
                if (hit((85 + nub), 80) == true) {
                    damagePit((85 + nub), 80);
                }
            }
            if (hit(80, 52) == true) {
                damagePit(80, 52);
            }
            if (hit(80, 53) == true) {
                damagePit(80, 53);
            }
            if (hit(80, 54) == true) {
                damagePit(80, 54);
            }
            if (hit(81, 57) == true) {
                damagePit(80, 57);
            }
            if (hit(80, 59) == true) {
                damagePit(80, 59);
            }

        }

    }

    public boolean hit(int col, int row) {
        boolean hit = false;

        gp.player.solidArea.x = gp.player.worldX + gp.player.solidArea.x;
        gp.player.solidArea.y = gp.player.worldY + gp.player.solidArea.y;
        eventRect[col][row].x = col * gp.tileSize + eventRect[col][row].x;
        eventRect[col][row].y = row * gp.tileSize + eventRect[col][row].y;

        if (gp.player.solidArea.intersects(eventRect[col][row])) {
//        if (gp.player.solidArea.intersects(eventRect[col][row]) && eventRect[col][row].eventDone == false) {

            hit = true;
            previousEventX = gp.player.worldX;
            previousEventY = gp.player.worldY;

//        }  
        }

        // after check then reset solidarea
        gp.player.solidArea.x = gp.player.solidAreaDefaultX;
        gp.player.solidArea.y = gp.player.solidAreaDefaultY;
        eventRect[col][row].x = eventRect[col][row].eventRectDefaultX;
        eventRect[col][row].y = eventRect[col][row].eventRectDefaultY;

        return hit; // if hit it will return true;
    }

    public void damagePit(int col, int row) {

//        eventRect[col][row].eventDone = true;
        canTouchEvent = false;

        if (gp.player.invincible == false) {
            gp.player.life -= 1;
            gp.player.invincible = true;
            if (gp.player.life > 0) {
                gp.ui.showMessage("You slip! Be careful.");
            }

        }

    }

}
