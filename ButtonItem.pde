class ButtonItem{
	int sizeX,sizeY,posX,posY;
	String text;
	DefaultButton button;
	ButtonItem(String text,DefaultButton button){
		this.button=button;
		this.text=text;
		this.sizeX=button.sizeX;
		this.sizeY=button.sizeY;
		this.posX=button.posX;
		this.posY=button.posY;
	}

	ButtonItem(String text,int posX,int posY,int sizeX,int sizeY){
		// super(text,posX,posY);
		this.posX=posX;
		this.posY=posY;
		this.sizeX=sizeX;
		this.sizeY=sizeY;
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
		text(text,posX+2,posY);
		popMatrix();
	}
}
