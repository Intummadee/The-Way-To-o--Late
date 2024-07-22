package object;

import java.io.*;

import javax.imageio.ImageIO;

public class OBJ_42  extends SuperObject{
	
	public OBJ_42() {
		
		name = "walk";
		try {
			image = ImageIO.read(getClass().getResourceAsStream("/objects/42.png"));
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
