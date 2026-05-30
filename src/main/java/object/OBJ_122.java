package object;

import java.io.IOException;

import javax.imageio.ImageIO;

public class OBJ_122  extends SuperObject{

		public OBJ_122() {
                    name = "";
			try {
				image = ImageIO.read(getClass().getResourceAsStream("/objects/122.png"));
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
}
