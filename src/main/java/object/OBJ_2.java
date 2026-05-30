package object;

import java.io.*;

import javax.imageio.ImageIO;

public class OBJ_2  extends SuperObject{
	
	public OBJ_2() {
		
		name = "walk";
		try {
			image = ImageIO.read(getClass().getResourceAsStream("/objects/2.png"));
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
