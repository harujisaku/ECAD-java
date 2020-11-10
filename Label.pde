class Label extends ECADObject{
	String text;
	int fontSize=13;
	color c=color(0);
	Label(String text,int posX,int posY){
		super(posX,posY);
		this.text=text;
	}

	Label(String text,int posX,int posY,int fontSize){
		super(posX,posY);
		this.text=text;
	}

	void setText(String text){
		this.text=text;
	}

	void setColor(color c){
		this.c=c;
	}

	void update(){
		if(!drawFlg) return;
		pushMatrix();
		textSize(fontSize);
		fill(c);
		text(text,posX,posY);
		popMatrix();
	}

	void show(){
		drawFlg=true;
	}

	void hide(){
		drawFlg=false;
	}
}
