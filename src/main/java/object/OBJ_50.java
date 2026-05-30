package object;

import java.io.IOException;

import javax.imageio.ImageIO;

public class OBJ_50  extends SuperObject{

		public OBJ_50() {
                    name = "";
			try {
				image = ImageIO.read(getClass().getResourceAsStream("/objects/50.png"));
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
}
