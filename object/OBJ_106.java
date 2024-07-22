package object;

import java.io.IOException;

import javax.imageio.ImageIO;

public class OBJ_106  extends SuperObject{

		public OBJ_106() {
                    name = "walk";
			try {
				image = ImageIO.read(getClass().getResourceAsStream("/objects/106.png"));
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
}
