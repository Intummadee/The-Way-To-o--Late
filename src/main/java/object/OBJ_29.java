package object;

import java.io.*;

import javax.imageio.ImageIO;

public class OBJ_29  extends SuperObject{
	
	public OBJ_29() {
		
		name = "";
		try {
			image = ImageIO.read(getClass().getResourceAsStream("/objects/29.png"));
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
