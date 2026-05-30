package object;

import java.io.IOException;

import javax.imageio.ImageIO;

public class OBJ_5  extends SuperObject{

		public OBJ_5() {
                    name = "";
			try {
				image = ImageIO.read(getClass().getResourceAsStream("/objects/5.png"));
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
}
