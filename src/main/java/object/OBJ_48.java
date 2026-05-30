package object;

import java.io.IOException;

import javax.imageio.ImageIO;

public class OBJ_48  extends SuperObject{

		public OBJ_48() {
                    name = "";
			try {
				image = ImageIO.read(getClass().getResourceAsStream("/objects/48.png"));
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
}
