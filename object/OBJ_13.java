package object;

import java.io.*;

import javax.imageio.ImageIO;

public class OBJ_13  extends SuperObject{
	
	public OBJ_13() {
		
		name = "";
		try {
			image = ImageIO.read(getClass().getResourceAsStream("/objects/13.png"));
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
