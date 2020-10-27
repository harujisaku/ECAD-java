package harujisaku.wire;
import java.lang.Math;
public class WireAngleFormating{
	public int[] format(int sX,int sY,int eX,int eY){
		int lX=eX-sX,lY=eY-sY;
		int c=max(abs(lX),abs(lY));
		int b=(int)(c*(Math.signum(max(lX,lY))));
		translate(sX,sY);
		int d=(int)(abs(degrees(atan2(lY,lX))));
		translate(-sX,-sY);
		if(d%90<20||d%90>90-20){
			int a[]={sX,sY,(abs(sX-eX)>abs(sY-eY)?eX:sX),(abs(sY-eY)>abs(sX-eX)?eY:sY)};
			return a;
		}
		int a[] ={sX,sY,sX+b*intnum(lX)*(lX<0&&lY<0?-1:1),sY+b*intnum(lY)*(lX<0&&lY<0?-1:1)};
		return a;
	}

	private int intnum(int a){
		return (int)(Math.signum(a));
	}
}
