package object;

import java.io.IOException;

import javax.imageio.ImageIO;

public class OBJ_105  extends SuperObject{

		public OBJ_105() {
                    name = "walk";
			try {
				image = ImageIO.read(getClass().getResourceAsStream("/objects/105.png"));
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
}
