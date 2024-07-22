package object;

import java.io.IOException;

import javax.imageio.ImageIO;

public class OBJ_65  extends SuperObject{

		public OBJ_65() {
                    name = "";
			try {
				image = ImageIO.read(getClass().getResourceAsStream("/objects/65.png"));
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
}
