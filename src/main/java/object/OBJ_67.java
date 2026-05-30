package object;

import java.io.IOException;

import javax.imageio.ImageIO;

public class OBJ_67  extends SuperObject{

		public OBJ_67() {
                    name = "";
			try {
				image = ImageIO.read(getClass().getResourceAsStream("/objects/67.png"));
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
}
