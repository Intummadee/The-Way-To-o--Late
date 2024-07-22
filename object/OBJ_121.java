package object;

import java.io.IOException;

import javax.imageio.ImageIO;

public class OBJ_121  extends SuperObject{

		public OBJ_121() {
                    name = "";
			try {
				image = ImageIO.read(getClass().getResourceAsStream("/objects/121.png"));
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
}
