package wire;
import primitive.*;

class Wire extends Line{
	public Wire(int startPosX,int startPosY,int endPosX,int endPosY){
		super(startPosX,startPosY,endPosX,endPosY);
	}

	public void setStartPos(int posX,int posY){
		super.startPosX=posX>=0?posX:super.startPosX;
		super.startPosY=posY>=0?posX:super.startPosY;
	}

	public void setEndPos(int posX,int posY){
		super.endPosX=posX>=0?posX:super.endPosX;
		super.endPosY=posY>=0?posX:super.endPosY;
	}
}
