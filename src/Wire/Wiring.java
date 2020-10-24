package ecad.wire;

import Wire.Wires;
import java.util.ArrayList;
/**
* 配線を管理するクラスです。
* @author haru jisaku
*/
public class Wiring{
	/**
	* クラスフィールドです
	*/
	ArrayList<Wires> wires = new ArrayList<Wires>();
	public Wiring(){

	}
	/**
	* testメソッドです
	* "Wiring"とprintします。
	*/
	public void test(){
		System.out.println("Wiring");
	}
	/**
	* addWiresメソッドです。
	* wiresを追加します。
	*/
	public void addWires(){
		wires.add(new Wires());
	}
/**
* addWireメソッドです
* @param id Wiresのid
* @param posStartX 配線の始点のX座標値です。
* @param posStartY 配線の始点のY座標値です。
* @param posEndX 配線の終点のX座標値です。
* @param posEndY 配線の終点のY座標値です。
*/
	public void addWire(int id,int posStartX,int posStartY,int posEndX,int posEndY){
		wires.get(id).addWire(id,posStartX,posStartY,posEndX,posEndY);
	}
}
