package object;

import java.io.*;

import javax.imageio.ImageIO;

public class OBJ_24  extends SuperObject{
	
	public OBJ_24() {
		
		name = "";
		try {
			image = ImageIO.read(getClass().getResourceAsStream("/objects/24.png"));
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
