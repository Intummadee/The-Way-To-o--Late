package object;

import java.io.IOException;

import javax.imageio.ImageIO;

public class OBJ_115  extends SuperObject{

		public OBJ_115() {
                    name = "walk";
			try {
				image = ImageIO.read(getClass().getResourceAsStream("/objects/115.png"));
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
}
