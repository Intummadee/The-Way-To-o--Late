package object;

import java.io.IOException;

import javax.imageio.ImageIO;

public class OBJ_110  extends SuperObject{

		public OBJ_110() {
                    name = "walk";
			try {
				image = ImageIO.read(getClass().getResourceAsStream("/objects/110.png"));
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
}
