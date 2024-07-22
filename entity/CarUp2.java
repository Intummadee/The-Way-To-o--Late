package entity;

import java.util.Random;
import main.GamePanel;

public class CarUp2 extends Entity {

    public CarUp2(GamePanel gp) {
        super(gp);
        collisionOn = false;
        direction = "up";
        speed = 2;
        getImage();
        type = 3;

    }

    public void getImage() {
       up1 = setUp("/npc/up2");
        up2 = setUp("/npc/up2");
        down1 = setUp("/npc/down1");
        down2 = setUp("/npc/down1");
    }

    @Override
    public void setAction() {
        // set cat behavior

        actionLockCounter++;
        
        if (actionLockCounter == 2350) {
            if (direction.equals("up")) {
                direction = "left";
            } else {
                direction = "right";
            }
        }
        if (actionLockCounter == 2400) {
            // direction won't change for the next 120 seconds
//            Random random = new Random();
//            int i = random.nextInt(100)+1; // pick up num from 1-100
            if (direction.equals("right")) {
                direction = "up";
            } else {
                direction = "down";
            }

            actionLockCounter = 0;

        }

    }

}