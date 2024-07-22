package object;

import java.io.IOException;

import javax.imageio.ImageIO;

public class OBJ_116  extends SuperObject{

		public OBJ_116() {
                    name = "walk";
			try {
				image = ImageIO.read(getClass().getResourceAsStream("/objects/116.png"));
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
}
