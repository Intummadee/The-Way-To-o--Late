package object;

import java.io.IOException;

import javax.imageio.ImageIO;

public class OBJ_35  extends SuperObject{

		public OBJ_35() {
                    name = "";
			try {
				image = ImageIO.read(getClass().getResourceAsStream("/objects/35.png"));
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
}
