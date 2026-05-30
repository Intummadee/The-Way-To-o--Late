package object;

import java.io.IOException;

import javax.imageio.ImageIO;

public class OBJ_54  extends SuperObject{

		public OBJ_54() {
                    name = "";
			try {
				image = ImageIO.read(getClass().getResourceAsStream("/objects/54.png"));
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
}
