package object;

import java.io.*;

import javax.imageio.ImageIO;

public class OBJ_97  extends SuperObject{
	
	public OBJ_97() {
		
		name = "";
		try {
			image = ImageIO.read(getClass().getResourceAsStream("/objects/97.png"));
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
