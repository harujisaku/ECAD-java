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

	PartsImage(BufferedImage partsImage,String imageGroup){
		this.partsImage=partsImage;
		this.imageGroup=imageGroup;
	}

	PartsImage(String imagePath,String imageGroup){
		this.imagePath=imagePath;
		this.imageGroup=imageGroup;
		this.partsImage = ImageIo.read(imagePath);
	}
}
