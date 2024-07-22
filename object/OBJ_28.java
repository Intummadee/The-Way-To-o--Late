package object;

import java.io.*;

import javax.imageio.ImageIO;

public class OBJ_28  extends SuperObject{
	
	public OBJ_28() {
		
		name = "";
		try {
			image = ImageIO.read(getClass().getResourceAsStream("/objects/28.png"));
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
