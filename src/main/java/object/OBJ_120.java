package object;

import java.io.IOException;

import javax.imageio.ImageIO;

public class OBJ_120  extends SuperObject{

		public OBJ_120() {
                    name = "";
			try {
				image = ImageIO.read(getClass().getResourceAsStream("/objects/120.png"));
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
}
