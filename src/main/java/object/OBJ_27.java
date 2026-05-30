package object;

import java.io.*;

import javax.imageio.ImageIO;

public class OBJ_27  extends SuperObject{
	
	public OBJ_27() {
		
		name = "";
		try {
			image = ImageIO.read(getClass().getResourceAsStream("/objects/27.png"));
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
