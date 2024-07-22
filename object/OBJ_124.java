package object;

import java.io.IOException;

import javax.imageio.ImageIO;

public class OBJ_124  extends SuperObject{

		public OBJ_124() {
                    name = "";
			try {
				image = ImageIO.read(getClass().getResourceAsStream("/objects/124.png"));
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
}
