package object;

import java.io.IOException;

import javax.imageio.ImageIO;

public class OBJ_51  extends SuperObject{

		public OBJ_51() {
                    name = "";
			try {
				image = ImageIO.read(getClass().getResourceAsStream("/objects/51.png"));
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
}
