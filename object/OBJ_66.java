package object;

import java.io.IOException;

import javax.imageio.ImageIO;

public class OBJ_66  extends SuperObject{

		public OBJ_66() {
                    name = "";
			try {
				image = ImageIO.read(getClass().getResourceAsStream("/objects/66.png"));
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
}
