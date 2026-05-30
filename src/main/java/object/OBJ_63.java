package object;

import java.io.IOException;

import javax.imageio.ImageIO;

public class OBJ_63  extends SuperObject{

		public OBJ_63() {
                    name = "";
			try {
				image = ImageIO.read(getClass().getResourceAsStream("/objects/63.png"));
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
}
