package entity;

import java.util.Random;
import main.GamePanel;

public class CarUp1 extends Entity {

    public CarUp1(GamePanel gp) {
        super(gp);
        direction = "up";
        speed = 2;
        getImage();
        collisionOn = false;
        type = 3;

    }

    public void getImage() {
        up1 = setUp("/npc/up1");
        up2 = setUp("/npc/up1");
        down1 = setUp("/npc/down2");
        down2 = setUp("/npc/down2");
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
            if (direction.equals("right")) {
                direction = "up";
            } else {
                direction = "down";
            }
            actionLockCounter = 0;
        }

    }

}