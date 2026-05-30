package object;

import java.io.*;

import javax.imageio.ImageIO;

public class OBJ_26  extends SuperObject{
	
	public OBJ_26() {
		
		name = "";
		try {
			image = ImageIO.read(getClass().getResourceAsStream("/objects/26.png"));
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
