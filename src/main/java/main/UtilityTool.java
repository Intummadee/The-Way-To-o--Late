package main;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

// conveinnt function in this class
public class UtilityTool {
   public BufferedImage scaleImage(BufferedImage original, int width, int height){
       
       BufferedImage scaleImage = new BufferedImage(width, height, original.getType());
       Graphics2D g2 = scaleImage.createGraphics(); // whatever g2 draw ,it will be save in sacledImage
       g2.drawImage(original, 0, 0, width, height, null); // scale of tile[0]image will be saved.
       g2.dispose();
       
       return scaleImage;
       
   } 
    
}
