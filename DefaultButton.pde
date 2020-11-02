class DefaultButton{
	color backgroundColor = color(175);
	color accentColor = color(200);
	color fowardColor = color(100);
	color grayColor = color(125);
	int posX,posY,sizeX,sizeY;
	boolean activFlg=true;
	DefaultButton(int posX,int posY,int sizeX,int sizeY){
		this.posX=posX;
		this.posY=posY;
		this.sizeX=sizeX;
		this.sizeY=sizeY;
	}

	void togleActiv(){
		activFlg=!activFlg;
	}

	void update(){
		draw();
	}

	protected void draw(){
		pushMatrix();
		noStroke();
		fill(activFlg?backgroundColor:grayColor);
		rect(posX,posY,sizeX,sizeY);
		fill(activFlg?fowardColor:grayColor);
		rect(posX+2,posY+2,sizeX-2,sizeY-2);
		fill(accentColor);
		rect(posX+2,posY+2,sizeX-4,sizeY-4);
		popMatrix();
	}
}
