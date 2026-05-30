package object;

import java.io.IOException;

import javax.imageio.ImageIO;

public class OBJ_109  extends SuperObject{

		public OBJ_109() {
                    name = "walk";
			try {
				image = ImageIO.read(getClass().getResourceAsStream("/objects/109.png"));
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
}
