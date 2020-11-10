class ButtonItem extends Rect{
	String text;
	DefaultButton button;
	ButtonItem(String text,DefaultButton button){
		super(button.posX,button.posY,button.posX+button.sizeX,button.posY+button.sizeY);
		this.button=button;
		this.text=text;
	}

	ButtonItem(String text,int posX,int posY,int sizeX,int sizeY){
		super(posX,posY,posX+sizeX,posY+sizeY);

	}

	void update(){
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
		text(text,startPosX+2,startPosY);
		popMatrix();
	}

	ButtonItem getParent(){
		return this;
	}
}
