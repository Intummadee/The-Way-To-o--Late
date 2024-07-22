package object;

import java.io.IOException;

import javax.imageio.ImageIO;

public class OBJ_99  extends SuperObject{

		public OBJ_99() {
                    name = "";
			try {
				image = ImageIO.read(getClass().getResourceAsStream("/objects/99.png"));
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
}
