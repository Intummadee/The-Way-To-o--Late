package object;

import java.io.*;

import javax.imageio.ImageIO;

public class OBJ_31  extends SuperObject{
	
	public OBJ_31() {
		
		name = "";
		try {
			image = ImageIO.read(getClass().getResourceAsStream("/objects/31.png"));
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
