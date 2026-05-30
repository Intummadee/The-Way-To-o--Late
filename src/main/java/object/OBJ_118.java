package object;

import java.io.IOException;

import javax.imageio.ImageIO;

public class OBJ_118  extends SuperObject{
		public OBJ_118() {
                    name = "Eunji";
			try {
				image = ImageIO.read(getClass().getResourceAsStream("/objects/118.png"));
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
}
