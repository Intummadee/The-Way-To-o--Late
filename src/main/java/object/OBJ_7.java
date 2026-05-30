package object;

import java.io.IOException;

import javax.imageio.ImageIO;

public class OBJ_7  extends SuperObject{

		public OBJ_7() {
                    name = "";
			try {
				image = ImageIO.read(getClass().getResourceAsStream("/objects/7.png"));
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
}
