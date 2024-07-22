package object;

import java.io.*;

import javax.imageio.ImageIO;

public class OBJ_11  extends SuperObject{
	
	public OBJ_11() {
		
		name = "";
		try {
			image = ImageIO.read(getClass().getResourceAsStream("/objects/11.png"));
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
