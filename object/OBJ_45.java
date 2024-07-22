package object;

import java.io.*;

import javax.imageio.ImageIO;

public class OBJ_45  extends SuperObject{
	
	public OBJ_45() {
		
		name = "walk";
		try {
			image = ImageIO.read(getClass().getResourceAsStream("/objects/45.png"));
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
