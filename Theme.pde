abstract class Theme extends Rect{
	Theme(int posX,int posY,int sizeX,int sizeY){
		super(posX,posY,posX+sizeX,posY+sizeY);
	}
	boolean activFlg=true;
	abstract void update();
	abstract void togleActiv();
}
