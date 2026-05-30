package object;

import java.io.*;

import javax.imageio.ImageIO;

public class OBJ_25  extends SuperObject{
	
	public OBJ_25() {
		
		name = "";
		try {
			image = ImageIO.read(getClass().getResourceAsStream("/objects/25.png"));
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
