package object;

import java.io.IOException;

import javax.imageio.ImageIO;

public class OBJ_64  extends SuperObject{

		public OBJ_64() {
                    name = "";
			try {
				image = ImageIO.read(getClass().getResourceAsStream("/objects/64.png"));
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
}
