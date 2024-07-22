package object;

import java.io.*;

import javax.imageio.ImageIO;

public class OBJ_9  extends SuperObject{
	
	public OBJ_9() {
		
		name = "";
		try {
			image = ImageIO.read(getClass().getResourceAsStream("/objects/9.png"));
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
