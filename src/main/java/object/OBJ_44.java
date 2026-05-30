package object;

import java.io.*;

import javax.imageio.ImageIO;

public class OBJ_44  extends SuperObject{
	
	public OBJ_44() {
		
		name = "walk";
		try {
			image = ImageIO.read(getClass().getResourceAsStream("/objects/44.png"));
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
