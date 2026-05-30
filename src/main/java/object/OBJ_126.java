package object;

import java.io.*;

import javax.imageio.ImageIO;

public class OBJ_126  extends SuperObject{
	
	public OBJ_126() {
		
            name = "water";
		
		try {
			image = ImageIO.read(getClass().getResourceAsStream("/objects/126.png"));
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
