package object;

import java.io.IOException;

import javax.imageio.ImageIO;

public class OBJ_6 extends SuperObject{

		public OBJ_6() {
		
		name = "";
		try {
			image = ImageIO.read(getClass().getResourceAsStream("/objects/6.png"));
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
