package harujisaku.collision.primitive;
/**
矩形の基本プリミティブです.
@author haru jisaku
*/
public class Rect {
	/**
	始点,終点座標
	*/
	public int startPosX,startPosY,endPosX,endPosY;
	/**
	自動計算の矩形サイズ
	*/
	public int sizeX,sizeY;
	/**
	初期化時に始点、終点座標を必要とします.
	*/
	public Rect(int startPosX,int startPosY,int endPosX,int endPosY){
		this.startPosX=startPosX;
		this.startPosY=startPosY;
		this.endPosX=endPosX;
		this.endPosY=endPosY;
		this.sizeX=startPosX-endPosX;
		this.sizeY=startPosY-endPosY;
	}
}
