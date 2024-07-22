package object;

import java.io.*;

import javax.imageio.ImageIO;
import main.GamePanel;
public class OBJ_Heart extends SuperObject{
    
    GamePanel gp;
    
    public OBJ_Heart(GamePanel gp) {
		this.gp = gp;
		name = "heart";
		try {
			image = ImageIO.read(getClass().getResourceAsStream("/objects/heart_full.png"));
			image2   = ImageIO.read(getClass().getResourceAsStream("/objects/heart_blank.png"));
                        
                        image = uTool.scaleImage(image, gp.tileSize-2, gp.tileSize);
			image2   = uTool.scaleImage(image2, gp.tileSize-2, gp.tileSize);
                        
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
    
}
