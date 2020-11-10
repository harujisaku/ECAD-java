package ecad.collision.primitive;
/**
点の基本プリミティブです.
@author haru jisaku
*/
public class Point{
	/**
	x,y座標
	*/
	public int posX,posY;
	/**
	初期化時にx,y座標を必要とします.
	@param posX 始点x座標
	@param posY 始点y座標
	*/
	Point(int posX,int posY){
		this.posX=posX;
		this.posY=posY;
	}
}
