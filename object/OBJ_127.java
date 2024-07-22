package object;

import java.io.*;

import javax.imageio.ImageIO;

public class OBJ_127  extends SuperObject{
	
	public OBJ_127() {
		
		 name = "end";
		try {
			image = ImageIO.read(getClass().getResourceAsStream("/objects/127.png"));
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
