package object;

import java.io.*;

import javax.imageio.ImageIO;

public class OBJ_96  extends SuperObject{
	
	public OBJ_96() {
		
		name = "";
		try {
			image = ImageIO.read(getClass().getResourceAsStream("/objects/96.png"));
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
