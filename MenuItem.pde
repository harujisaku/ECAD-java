class MenuItem extends ButtonItem{
	String text;
	Theme menu;
	MenuItem(String text,Theme menu){
		super(text,menu);
		this.sizeX=menu.sizeX;
	}
	MenuItem(String text,int posX,int posY,int sizeX,int sizeY){
		super(text,posX,posY,sizeX,sizeY);
	}
}
