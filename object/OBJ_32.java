package object;

import java.io.*;

import javax.imageio.ImageIO;

public class OBJ_32  extends SuperObject{
	
	public OBJ_32() {
		
		name = "";
		try {
			image = ImageIO.read(getClass().getResourceAsStream("/objects/32.png"));
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
