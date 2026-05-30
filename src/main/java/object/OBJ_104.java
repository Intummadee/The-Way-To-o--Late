package object;

import java.io.IOException;

import javax.imageio.ImageIO;

public class OBJ_104  extends SuperObject{

		public OBJ_104() {
                    name = "walk";
			try {
				image = ImageIO.read(getClass().getResourceAsStream("/objects/104.png"));
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
}
