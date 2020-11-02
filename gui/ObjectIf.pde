interface ObjectIf{
	int posX,posY;
	Color color;
	default void setPos(int posX,int posY ){
		this.posX=posX;
		this.posY=posY;
	}
	default void setColor(Color color){
		this.color=color;
	}
}
