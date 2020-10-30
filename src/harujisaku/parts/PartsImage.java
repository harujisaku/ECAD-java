package harujisaku.parts;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

public class PartsImage {
	BufferedImage partsImage;
	String imagePath,partsGroup;
	public PartsImage(BufferedImage partsImage){
		this.partsImage=partsImage;
	}

	public PartsImage(BufferedImage partsImage,String partsGroup){
		this.partsImage=partsImage;
		this.partsGroup=partsGroup;
	}

	public PartsImage(String imagePath,String partsGroup){
		this.imagePath=imagePath;
		this.partsGroup=partsGroup;
		try {
			this.partsImage = ImageIO.read(new File(imagePath));
		} catch(Exception e) {
			System.err.println(e.getMessage());
		}
	}
}
