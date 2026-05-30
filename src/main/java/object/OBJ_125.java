package object;

import java.io.IOException;

import javax.imageio.ImageIO;

public class OBJ_125  extends SuperObject{

		public OBJ_125() {
                    name = "";
			try {
				image = ImageIO.read(getClass().getResourceAsStream("/objects/125.png"));
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
}
