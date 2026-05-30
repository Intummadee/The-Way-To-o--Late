package object;

import java.io.IOException;

import javax.imageio.ImageIO;

public class OBJ_36  extends SuperObject{

		public OBJ_36() {
                    name = "";
			try {
				image = ImageIO.read(getClass().getResourceAsStream("/objects/36.png"));
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
}
