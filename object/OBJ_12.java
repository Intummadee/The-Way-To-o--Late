package object;

import java.io.*;

import javax.imageio.ImageIO;

public class OBJ_12  extends SuperObject{
	
	public OBJ_12() {
		
		name = "";
		try {
			image = ImageIO.read(getClass().getResourceAsStream("/objects/12.png"));
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
