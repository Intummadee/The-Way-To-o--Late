package object;

import java.io.IOException;
import javax.imageio.ImageIO;
import main.GamePanel;

public class OBJ_Eunji extends SuperObject {
    
    GamePanel gp;
            
    
    public OBJ_Eunji(GamePanel gp){
        this.gp = gp;
        
        name = "Eunji";
        try{
            image = ImageIO.read(getClass().getResourceAsStream("/objects/Eunji.png"));
            uTool.scaleImage(image, gp.tileSize, gp.tileSize);
        }catch(IOException e){
            e.printStackTrace();
            System.out.println("eunji");
        }
//        solidArea.x = 5;
        
        
    }

    
}
