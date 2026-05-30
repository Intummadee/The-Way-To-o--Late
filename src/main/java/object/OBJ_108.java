package object;

import java.io.IOException;

import javax.imageio.ImageIO;

public class OBJ_108  extends SuperObject{

		public OBJ_108() {
                    name = "walk";
			try {
				image = ImageIO.read(getClass().getResourceAsStream("/objects/108.png"));
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
}
