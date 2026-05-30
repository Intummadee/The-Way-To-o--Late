package object;

import java.io.IOException;

import javax.imageio.ImageIO;

public class OBJ_57  extends SuperObject{

		public OBJ_57() {
                    name = "";
			try {
				image = ImageIO.read(getClass().getResourceAsStream("/objects/57.png"));
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
}
