package object;

import java.io.IOException;

import javax.imageio.ImageIO;

public class OBJ_58  extends SuperObject{

		public OBJ_58() {
                    name = "";
			try {
				image = ImageIO.read(getClass().getResourceAsStream("/objects/58.png"));
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
}
