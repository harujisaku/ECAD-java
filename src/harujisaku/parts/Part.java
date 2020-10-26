package harujisaku.parts;
import harujisaku.collision.primitive.*;
class Part extends Rect {
	Part(int posX,int posY,int sizeX,int sizeY,int ofsetX,int ofsetY,String partPath,String partsGroup){
		super(posX-ofsetX,posX-ofsetX+sizeX,posY-ofsetY,posY-ofsetY+sizeY);
	}

	Part(int posX,int posY,int sizeX,int sizeY,int ofsetX,int ofsetY,String partPath){
		super(posX-ofsetX,posX-ofsetX+sizeX,posY-ofsetY,posY-ofsetY+sizeY);
	}

	Part(int posX,int posY,int sizeX,int sizeY,int ofsetX,int ofsetY,PartsImage partsImage){

	}
}
