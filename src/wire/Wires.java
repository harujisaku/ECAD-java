package wire;

import wire.Wire;
import wire.WireGroup;
import java.util.ArrayList;


public class Wires {
	ArrayList<Wire> wire = new ArrayList<Wire>();
	ArrayList<ArrayList<Integer>> id = new ArrayList<ArrayList<Integer>>();
	WireGroup wireGroup=new WireGroup(id,wire);
	/**
* 引数は必要ありません
	*/
	public Wires(){};
/**
	* Wireを追加します。
	@param startPosX 追加する{@link Wire}の始点x
	@param startPosY 追加する{@link Wire}の始点y
	@param endPosX 追加する{@link Wire}の終点x
	@param endPosY 追加する{@link Wire}の終点y
*/
	public void addWire(int startPosX,int startPosY,int endPosX,int endPosY){
		wire.add(new Wire(startPosX,startPosY,endPosX,endPosY));
	}
	/**
	{@link WireGroup}でWireをグルーピングします。
	*/

	public void groupingWire(){
		wireGroup.groupingWire();
	}
}
