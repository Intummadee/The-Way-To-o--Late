package object;

import java.io.*;

import javax.imageio.ImageIO;

public class OBJ_46  extends SuperObject{
	
	public OBJ_46() {
		
		name = "walk";
		try {
			image = ImageIO.read(getClass().getResourceAsStream("/objects/46.png"));
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
