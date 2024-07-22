package object;

import java.io.*;

import javax.imageio.ImageIO;

public class OBJ_43  extends SuperObject{
	
	public OBJ_43() {
		
		name = "walk";
		try {
			image = ImageIO.read(getClass().getResourceAsStream("/objects/43.png"));
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
