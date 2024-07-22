package object;

import java.io.IOException;

import javax.imageio.ImageIO;

public class OBJ_59  extends SuperObject{

		public OBJ_59() {
                    name = "";
			try {
				image = ImageIO.read(getClass().getResourceAsStream("/objects/59.png"));
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
}
