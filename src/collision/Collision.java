package collision;
import collision.primitive.*;

/**
* 当たり判定のクラスです.
@author haru jisaku
*/


public class Collision {
	/**
	特に引数は必要ありません
	*/
	public Collision(){}

/**
線分と線分の当たり判定です.
@param l1 1つ目の{@linl Line}です.
@param l2 1つ目のlineです.
@return l1とl2が接触していればtrueしていなければfalseを返します.
*/
	static public boolean testLineLine(Line l1,Line l2){
		int ax=l1.startPosX, ay=l1.startPosY, bx=l1.endPosX, by=l1.endPosY;
		int cx=l2.startPosX, cy=l2.startPosY, dx=l2.endPosX, dy=l2.endPosY;
		float ta = (((cx - dx) * (ay - cy)) + ((cy - dy) * (cx - ax)));
		float tb = (((cx - dx) * (by - cy)) + ((cy - dy) * (cx - bx)));
		float tc = (((ax - bx) * (cy - ay)) + ((ay - by) * (ax - cx)));
		float td = (((ax - bx) * (dy - ay)) + ((ay - by) * (ax - dx)));
		if ((int)(tc * td) < 0 && (int)(ta * tb) < 0){
			return true;
		}
		return false;
	}
	/**
	矩形と点の当たり判定です.
	@param r このRectにPointが接触しているかを判定します.
	@param p このPointにRectが接触しているかを判定します.
	@return rとpが接触していればtrueしていなければfalseを返します.
	*/
	public static boolean testRectPoint(Rect r,Point p){
		int ax=r.startPosX,ay=r.startPosY,bx=r.endPosX,by=r.endPosY,cx=p.posX,cy=p.posY;
		if(cx>=bx&&cx<=ax&&cy>=by&&cy<=ay){
			return true;
		}
		return false;
	}
/**
* 矩形と座標一箇所の当たり判定です.
@param r このRectに指定した座標が接触しているかを判定します.
@param cx この座標とRectが接触しているかを判断します.
@param cy この座標とRectが接触しているかを判断します.
@return rとcx,cyで表される座標が接触していればtrueしていなければfalseを返します.
*/
	public static boolean testRectPoint(Rect r,int cx,int cy){
		int ax=r.startPosX,ay=r.startPosY,bx=r.endPosX,by=r.endPosY;
		if(cx>=bx&&cx<=ax&&cy>=by&&cy<=ay){
			return true;
		}
		return false;
	}

	public static boolean testLinePoint(Line l1,Point p){
		int x=p.posX,y=p.posY,ax=l1.startPosX, ay=l1.startPosY, bx=l1.endPosX, by=l1.endPosY,a=(int)((bx-ax)*(x-ax)+(by-ay)*(y-ay));
		float al1=(float)Math.sqrt(Math.pow(bx-ax,2)+Math.pow(by-ay,2)),al2=(float)Math.sqrt(Math.pow(x-ax,2)+Math.pow(y-ay,2)),b;
		b=al1*al2;
		if(a==b&&al1>=al2){
			return true;
		}
		return false;
	}

	public static boolean testLinePoint(Line l1,int x,int y){
		int ax=l1.startPosX, ay=l1.startPosY, bx=l1.endPosX, by=l1.endPosY,a=(int)((bx-ax)*(x-ax)+(by-ay)*(y-ay));
		float al1=(float)Math.sqrt((float)Math.pow(bx-ax,2)+(float)Math.pow(by-ay,2)),al2=(float)Math.sqrt((float)(Math.pow(x-ax,2)+Math.pow(y-ay,2))),b;
		b=al1*al2;
		if(a==b&&al1>=al2){
			return true;
		}
		return false;
	}

}
