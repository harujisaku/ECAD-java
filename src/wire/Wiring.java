package wire;

import wire.Wires;
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
* @param startPosX 配線の始点のX座標値です。
* @param startPosY 配線の始点のY座標値です。
* @param endPosX 配線の終点のX座標値です。
* @param endPosY 配線の終点のY座標値です。
*/
	public void addWire(int id,int startPosX,int startPosY,int endPosX,int endPosY){
		wires.get(id).addWire(startPosX,startPosY,endPosX,endPosY);
	}
}
