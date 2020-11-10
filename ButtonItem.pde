class ButtonItem extends ECADObject{
	String text;
	Theme button;
	int sizeX,sizeY;
	ButtonItem(String text,Theme button){
		super(button.startPosX,button.startPosY);
		this.sizeX=button.sizeX;
		this.sizeY=button.sizeY;
		this.button=button;
		this.text=text;
	}

	ButtonItem(String text,int posX,int posY,int sizeX,int sizeY){
		super(posX,posY);
		this.sizeX=sizeX;
		this.sizeY=sizeY;
		this.text=text;
	}

	void update(){
		if(!drawFlg) return;
		pushMatrix();
		button.update();
		if(textWidth(text)>sizeX){
			String printText;
			for(int i=text.length();i>0;i--){
				printText = text.substring(0,i);
				if(textWidth(printText)<sizeX){
					text=printText;
					break;
				}
			}
		}
		fill(0);
		stroke(0);
		textAlign(LEFT,TOP);
		text(text,posX+2,posY);
		popMatrix();
	}

	ButtonItem getParent(){
		return this;
	}

	void togleActiv(){
		button.togleActiv();
	}

	Rect getRect(){
		return (Rect)button;
	}
	@Override
	void hide(){
		drawFlg=false;
	}

	@Override
	void show(){
		drawFlg=true;
	}
}
