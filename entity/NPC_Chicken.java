package entity;

import java.util.Random;
import main.GamePanel;

public class NPC_Chicken extends Entity {

    public NPC_Chicken(GamePanel gp) {
        super(gp);
        type = 2 ; 
        direction = "down";
        speed = 1;
        getImage();

    }

    public void getImage() {
        up1 = setUp("/npc/chic_up1");
        up2 = setUp("/npc/chic_up2");
        up3 = setUp("/npc/chic_up3");
        up4 = setUp("/npc/chic_up4");
        down1 = setUp("/npc/chic_down1");
        down2 = setUp("/npc/chic_down2");
        down3 = setUp("/npc/chic_down3");
        down4 = setUp("/npc/chic_down4");
        left1 = setUp("/npc/chic_left1");
        left2 = setUp("/npc/chic_left2");
        left3 = setUp("/npc/chic_left3");
        left4 = setUp("/npc/chic_left4");
        right1 = setUp("/npc/chic_right1");
        right2 = setUp("/npc/chic_right2");
        right3 = setUp("/npc/chic_right3");
        right4 = setUp("/npc/chic_right4");

    }

    @Override
    public void setAction() {
        // set chicken behavior

        actionLockCounter++;

        if (actionLockCounter == 120) {
            // direction won't change for the next 120 seconds
            Random random = new Random();
            int i = random.nextInt(100) + 1; // pick up num from 1-100
            if (i <= 25) {
                direction = "up";
            }
            if (i > 25 && i <= 50) {
                direction = "down";
            }
            if (i > 50 && i <= 75) {
                direction = "left";
            }
            if (i > 75 && i <= 100) {
                direction = "right";
            }

            actionLockCounter = 0;

        }

    }

}
