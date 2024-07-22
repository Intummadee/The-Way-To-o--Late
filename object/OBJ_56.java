package object;

import java.io.IOException;

import javax.imageio.ImageIO;

public class OBJ_56  extends SuperObject{

		public OBJ_56() {
                    name = "";
			try {
				image = ImageIO.read(getClass().getResourceAsStream("/objects/56.png"));
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
}
