package object;

import java.io.*;

import javax.imageio.ImageIO;

public class OBJ_30  extends SuperObject{
	
	public OBJ_30() {
		
		name = "";
		try {
			image = ImageIO.read(getClass().getResourceAsStream("/objects/30.png"));
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
