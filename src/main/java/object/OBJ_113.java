package object;

import java.io.IOException;

import javax.imageio.ImageIO;

public class OBJ_113  extends SuperObject{

		public OBJ_113() {
                    name = "walk";
			try {
				image = ImageIO.read(getClass().getResourceAsStream("/objects/113.png"));
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
}
