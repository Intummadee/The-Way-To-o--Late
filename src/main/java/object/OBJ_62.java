package object;

import java.io.IOException;

import javax.imageio.ImageIO;

public class OBJ_62  extends SuperObject{

		public OBJ_62() {
                    name = "";
			try {
				image = ImageIO.read(getClass().getResourceAsStream("/objects/62.png"));
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
}
