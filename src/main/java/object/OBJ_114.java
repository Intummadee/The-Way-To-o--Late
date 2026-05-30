package object;

import java.io.IOException;

import javax.imageio.ImageIO;

public class OBJ_114  extends SuperObject{

		public OBJ_114() {
                    name = "walk";
			try {
				image = ImageIO.read(getClass().getResourceAsStream("/objects/114.png"));
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
}
