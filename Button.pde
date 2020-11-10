class Button extends ButtonItem{
	Rect rect;
	Button(String text,DefaultButton button){
		super(text,button);
		rect = getRect();
	}

	Button(String text,int posX,int posY,int sizeX,int sizeY){
		super(text,posX,posY,sizeX,sizeY);
	}

	boolean isClick(int posX,int posY){
		if(!drawFlg) return false;
		return Collision.testRectPoint(rect,posX,posY);
	}
}
