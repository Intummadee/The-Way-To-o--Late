package entity;
import java.util.Random;
import main.GamePanel;

public class NPC_Cat extends Entity{
    
    public NPC_Cat(GamePanel gp){
        super(gp);
        type = 2;
        direction = "down";
        speed = 1;
        getImage();
        
    }
    public void getImage() {
        up1 = setUp("/npc/catup1");
        up2 = setUp("/npc/catup2");
        down1 = setUp("/npc/catdown1");
        down2 = setUp("/npc/catdown2");
        left1 = setUp("/npc/catleft1");
        left2 = setUp("/npc/catleft2");
        right1 = setUp("/npc/catright1");
        right2 = setUp("/npc/catright2");
       
    }

    @Override
    public void setAction(){
        // set cat behavior
        
        actionLockCounter ++;
        
        if(actionLockCounter == 120){
            // direction won't change for the next 120 seconds
            Random random = new Random();
            int i = random.nextInt(100)+1; // pick up num from 1-100
            if(i <= 25){
                direction = "up";
            }
            if(i > 25 && i <= 50){
                direction = "down";
            }
            if(i > 50 && i <= 75){
                direction = "left";
            }
            if(i > 75 && i <= 100){
                direction = "right";
            }
            
            actionLockCounter = 0;
            
        }
        
        
        
    }
    
    
    
}
