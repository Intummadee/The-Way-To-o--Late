package object;

import java.io.*;

import javax.imageio.ImageIO;

public class OBJ_23  extends SuperObject{
	
	public OBJ_23() {
		
		name = "";
		try {
			image = ImageIO.read(getClass().getResourceAsStream("/objects/23.png"));
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
