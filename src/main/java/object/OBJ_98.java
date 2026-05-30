package object;

import java.io.*;

import javax.imageio.ImageIO;

public class OBJ_98  extends SuperObject{
	
	public OBJ_98() {
		
		name = "";
		try {
			image = ImageIO.read(getClass().getResourceAsStream("/objects/98.png"));
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
