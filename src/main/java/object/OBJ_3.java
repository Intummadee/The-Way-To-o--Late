package object;

import java.io.*;

import javax.imageio.ImageIO;

public class OBJ_3  extends SuperObject{
	
	public OBJ_3() {
		
		name = "walk";
		try {
			image = ImageIO.read(getClass().getResourceAsStream("/objects/3.png"));
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
