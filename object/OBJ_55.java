package object;

import java.io.IOException;

import javax.imageio.ImageIO;

public class OBJ_55  extends SuperObject{

		public OBJ_55() {
                    name = "";
			try {
				image = ImageIO.read(getClass().getResourceAsStream("/objects/55.png"));
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
}
