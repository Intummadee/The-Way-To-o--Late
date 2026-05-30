package object;

import java.io.*;

import javax.imageio.ImageIO;

public class OBJ_Egg  extends SuperObject{
	
	public OBJ_Egg() {
		
		name = "Egg";
		try {
			image = ImageIO.read(getClass().getResourceAsStream("/objects/Egg.png"));
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
