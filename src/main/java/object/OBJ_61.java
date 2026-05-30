package object;

import java.io.IOException;

import javax.imageio.ImageIO;

public class OBJ_61  extends SuperObject{

		public OBJ_61() {
                    name = "";
			try {
				image = ImageIO.read(getClass().getResourceAsStream("/objects/61.png"));
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
}
