package harujisaku.parts;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
class PartsImage {
	BufferedImage partsImage;
	String imagePath,partsGroup;
	PartsImage(BufferedImage partsImage){
		this.partsImage=partsImage;
	}

	PartsImage(BufferedImage partsImage,String partsGroup){
		this.partsImage=partsImage;
		this.partsGroup=partsGroup;
	}

	PartsImage(String imagePath,String partsGroup){
		this.imagePath=imagePath;
		this.partsGroup=partsGroup;
		try {
			this.partsImage = ImageIO.read(new File(imagePath));
		} catch(Exception e) {
			System.err.println(e.getMessage());
		}
	}
}
