class Label implements ObjectIf{
	String text;
	int fontSize;
	Label(String text,int posX,int posY){
		this.text=text;
	}

	Label(String text,int posX,int posY,int fontSize){
		this.text=text;
	}

	void setText(String text){
		this.text=text;
	}

	void update(){
		pushMatrix();
		textSize(fontSize);
		fill(255);
		text(text,posX,posY);
		popMatrix();
	}

}
