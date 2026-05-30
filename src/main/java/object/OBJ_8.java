package object;

import java.io.IOException;

import javax.imageio.ImageIO;

public class OBJ_8  extends SuperObject{

		public OBJ_8() {
                    name = "";
			try {
				image = ImageIO.read(getClass().getResourceAsStream("/objects/8.png"));
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
}
