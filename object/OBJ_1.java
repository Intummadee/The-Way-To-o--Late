package object;

import java.io.*;

import javax.imageio.ImageIO;

public class OBJ_1  extends SuperObject{
	
	public OBJ_1() {
		
		name = "walk";
		try {
			image = ImageIO.read(getClass().getResourceAsStream("/objects/1.png"));
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
