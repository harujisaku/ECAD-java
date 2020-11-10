class DefaultButton extends Theme{
	color backgroundColor = color(175);
	color accentColor = color(200);
	color fowardColor = color(100);
	color grayColor = color(125);
	boolean activFlg=true;
	DefaultButton(int posX,int posY,int sizeX,int sizeY){
		super(posX,posY,sizeX,sizeY);
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
		rect(startPosX,startPosY,sizeX,sizeY);
		fill(activFlg?fowardColor:grayColor);
		rect(startPosX+2,startPosY+2,sizeX-2,sizeY-2);
		fill(accentColor);
		rect(startPosX+2,startPosY+2,sizeX-4,sizeY-4);
		popMatrix();
	}
}
