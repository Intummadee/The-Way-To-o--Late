package object;

import java.io.IOException;

import javax.imageio.ImageIO;

public class OBJ_89  extends SuperObject{

		public OBJ_89() {
                    name = "";
			try {
				image = ImageIO.read(getClass().getResourceAsStream("/objects/89.png"));
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
}
