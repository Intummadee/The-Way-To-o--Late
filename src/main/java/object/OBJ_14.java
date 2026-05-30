package object;

import java.io.*;

import javax.imageio.ImageIO;

public class OBJ_14  extends SuperObject{
	
	public OBJ_14() {
		
		name = "";
		try {
			image = ImageIO.read(getClass().getResourceAsStream("/objects/14.png"));
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
