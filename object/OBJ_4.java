package object;

import java.io.*;

import javax.imageio.ImageIO;

public class OBJ_4  extends SuperObject{
	
	public OBJ_4() {
		
            name = "red tank";
		
		try {
			image = ImageIO.read(getClass().getResourceAsStream("/objects/4.png"));
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
