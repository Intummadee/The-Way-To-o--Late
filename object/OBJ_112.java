package object;

import java.io.IOException;

import javax.imageio.ImageIO;

public class OBJ_112  extends SuperObject{

		public OBJ_112() {
                    name = "walk";
			try {
				image = ImageIO.read(getClass().getResourceAsStream("/objects/112.png"));
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
}
