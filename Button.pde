class Button extends ButtonItem{
	Rect rect;
	Button(String text,DefaultButton button){
		super(text,button);
		rect = (Rect)getParent();
	}

	Button(String text,int posX,int posY,int sizeX,int sizeY){
		super(text,posX,posY,sizeX,sizeY);
	}

	boolean isClick(int posX,int posY){
		return Collision.testRectPoint(rect,posX,posY);
	}
}
