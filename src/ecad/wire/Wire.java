package ecad.wire;
import ecad.collision.primitive.*;
/**
線を管理するクラスです..
@author haru jisaku
*/
public class Wire extends Line{
/**
@param startPosX 配線の始点x座標
@param startPosY 配線の始点y座標
@param endPosX 配線の終点x座標
@param endPosY 配線の終点y座標
	*/
	public Wire(int startPosX,int startPosY,int endPosX,int endPosY){
		super(startPosX,startPosY,endPosX,endPosY);
	}

/**
*Wireの始点座標を変更します..
* Wireの始点座標を変更しますが、引数が0未満の場合値を変更しません.
@param posX 変更する始点のx座標
@param posY 変更する始点のy座標
*/

	public void setStartPos(int posX,int posY){
		super.startPosX=posX>=0?posX:super.startPosX;
		super.startPosY=posY>=0?posX:super.startPosY;
	}


	/**
	*Wireの終点座標を変更します..
	* Wireの終点座標を変更しますが、引数が0未満の場合値を変更しません.
	@param posX 変更する終点のx座標
	@param posY 変更する終点のy座標
	*/

	public void setEndPos(int posX,int posY){
		super.endPosX=posX>=0?posX:super.endPosX;
		super.endPosY=posY>=0?posX:super.endPosY;
	}
/**
Wireを移動します.
始点を基準として絶対座標指定です。
引数が0未満の場合値を変更しません。
@param posX
@param posY
*/
	public void moveWire(int posX,int posY){
		super.endPosX=posX>=0?super.endPosX-super.startPosX+posX:super.endPosX;
		super.endPosY=posY>=0?super.endPosY-super.startPosY+posY:super.endPosY;
		super.startPosX=posX>=0?posX:super.startPosX;
		super.startPosY=posY>=0?posY:super.startPosY;
	}
/**
Wireを相対移動します.
Wireを相対位置指定移動します。
@param posX 移動分X座標
@param posY 移動分Y座標
*/
	public void relativeMoveWire(int posX,int posY){
		super.startPosX+=posX;
		super.startPosY+=posY;
	}
}
