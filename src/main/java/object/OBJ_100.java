package object;

import java.io.IOException;

import javax.imageio.ImageIO;

public class OBJ_100  extends SuperObject{

		public OBJ_100() {
                    name = "";
			try {
				image = ImageIO.read(getClass().getResourceAsStream("/objects/100.png"));
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
}
