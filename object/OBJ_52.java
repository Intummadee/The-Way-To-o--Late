package object;

import java.io.IOException;

import javax.imageio.ImageIO;

public class OBJ_52  extends SuperObject{

		public OBJ_52() {
                    name = "";
			try {
				image = ImageIO.read(getClass().getResourceAsStream("/objects/52.png"));
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
}
