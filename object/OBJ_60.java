package object;

import java.io.IOException;

import javax.imageio.ImageIO;

public class OBJ_60  extends SuperObject{

		public OBJ_60() {
                    name = "";
			try {
				image = ImageIO.read(getClass().getResourceAsStream("/objects/60.png"));
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
}
