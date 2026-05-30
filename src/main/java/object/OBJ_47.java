package object;

import java.io.*;

import javax.imageio.ImageIO;

public class OBJ_47  extends SuperObject{
	
	public OBJ_47() {
		
		name = "walk";
		try {
			image = ImageIO.read(getClass().getResourceAsStream("/objects/47.png"));
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
