package harujisaku.collision.primitive;
/**
* 線分の基本プリミティブです.
@author haru jisaku
*/

public class Line{
	/**
	始点、終点座標
	*/
	public int startPosX,startPosY,endPosX,endPosY;
	/**
	初期化時に始点、終点を必要とします.
	@param startPosX 始点x座標
	@param startPosY 始点y座標
	@param endPosX 終点x座標
	@param endPosY 終点y座標
	*/
	protected Line(int startPosX,int startPosY,int endPosX,int endPosY){
		this.startPosX=startPosX;
		this.startPosY=startPosY;
		this.endPosX=endPosX;
		this.endPosY=endPosY;
	}
}
