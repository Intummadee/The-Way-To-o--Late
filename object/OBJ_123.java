package object;

import java.io.IOException;

import javax.imageio.ImageIO;

public class OBJ_123  extends SuperObject{

		public OBJ_123() {
                    name = "";
			try {
				image = ImageIO.read(getClass().getResourceAsStream("/objects/123.png"));
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
}
