package object;

import java.io.IOException;

import javax.imageio.ImageIO;

public class OBJ_38  extends SuperObject{

		public OBJ_38() {
                    name = "";
			try {
				image = ImageIO.read(getClass().getResourceAsStream("/objects/38.png"));
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
}
