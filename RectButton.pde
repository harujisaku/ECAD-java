class RectButton extends DefaultButton{
	RectButton(int posX,int posY,int sizeX,int sizeY){
		super(posX,posY,sizeX,sizeY);
		backgroundColor = color(255);
		accentColor = color(51,153,255);
		fowardColor = color(255);
	}

	@Override
	void draw(){
		pushMatrix();
		fill(backgroundColor);
		noStroke();
		rect(posX,posY,sizeX,sizeY);
		stroke(activFlg?accentColor:grayColor);
		strokeWeight(2);
		rect(posX+2,posY+2,sizeX-4,sizeY-4);
		popMatrix();
	}
}
