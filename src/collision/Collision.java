package collision;
import primitive.*;


public class Collision {
	public Collision(){}

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

	public static boolean testRectPoint(Rect r,Point p){
		int ax=r.startPosX,ay=r.startPosY,bx=r.endPosX,by=r.endPosY,cx=p.posX,cy=p.posY;
		if(cx>=bx&&cx<=ax&&cy>=by&&cy<=ay){
			return true;
		}
		return false;
	}

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
