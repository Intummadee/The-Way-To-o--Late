package object;

import java.io.IOException;

import javax.imageio.ImageIO;

public class OBJ_37  extends SuperObject{

		public OBJ_37() {
                    name = "";
			try {
				image = ImageIO.read(getClass().getResourceAsStream("/objects/37.png"));
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
}
