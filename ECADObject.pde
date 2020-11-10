public abstract class ECADObject{
	int posX,posY;
	boolean drawFlg=true;
	ECADObject(int posX,int posY){
		this.posX=posX;
		this.posY=posY;
	};
	void setPos(int posX,int posY){
		this.posX=posX;
		this.posY=posY;
	};

	abstract void update();
	abstract void hide();
	abstract void show();

}
