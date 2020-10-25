package primitive;

public class Rect {
	public int startPosX,startPosY,endPosX,endPosY;
	public Rect(int startPosX,int startPosY,int endPosX,int endPosY){
		this.startPosX=startPosX;
		this.startPosY=startPosY;
		this.endPosX=endPosX;
		this.endPosY=endPosY;
		int SizeX=startPosX-endPosX;
		int SizeY=startPosY-endPosY;
	}
}
