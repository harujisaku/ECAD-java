package harujisaku.parts;
import harujisaku.collision.primitive.*;
public class Part extends Rect {
	protected int direction,ofsetX,ofsetY;
	protected String partPath,partsGroup;
	public Part(int posX,int posY,int sizeX,int sizeY,int ofsetX,int ofsetY,String partPath,String partsGroup){
		super(posX-ofsetX,posX-ofsetX+sizeX,posY-ofsetY,posY-ofsetY+sizeY);
	}

	public Part(int posX,int posY,int sizeX,int sizeY,int ofsetX,int ofsetY,String partPath){
		super(posX-ofsetX,posX-ofsetX+sizeX,posY-ofsetY,posY-ofsetY+sizeY);
	}

	public Part(int posX,int posY,int sizeX,int sizeY,int ofsetX,int ofsetY,PartsImage partsImage){
		super(posX-ofsetX,posX-ofsetX+sizeX,posY-ofsetY,posY-ofsetY+sizeY);
	}
	public void movePart(int posX,int posY){
		super.startPosX=(posX<=0?posX:super.startPosX);
		super.startPosY=(posY<=0?posY:super.startPosY);
	}

	public void directionPart(int direction){
		if (direction>=0&&direction<=3) {
			this.direction=direction;
		}
	}

	public void relativeMovePart(int posX,int posY){
		super.startPosX+=posX;
		super.startPosY+=posY;
	}

	public void setDirection(int direction){
		if (direction>=0&&direction<=3) {
			this.direction=direction;
		}
	}

	public int getDirection(){
		return direction;
	}

	public void ofsetBasedMovePart(int posX,int posY){
		super.startPosX=(posX<=0?posX-ofsetX:super.startPosX);
		super.startPosY=(posY<=0?posY-ofsetY:super.startPosY);
	}
}
