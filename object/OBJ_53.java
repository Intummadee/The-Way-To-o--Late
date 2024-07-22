package object;

import java.io.IOException;

import javax.imageio.ImageIO;

public class OBJ_53  extends SuperObject{

		public OBJ_53() {
                    name = "";
			try {
				image = ImageIO.read(getClass().getResourceAsStream("/objects/53.png"));
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
}
