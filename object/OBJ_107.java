package object;

import java.io.IOException;

import javax.imageio.ImageIO;

public class OBJ_107  extends SuperObject{

		public OBJ_107() {
                    name = "walk";
			try {
				image = ImageIO.read(getClass().getResourceAsStream("/objects/107.png"));
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
}
