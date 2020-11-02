package ecad.wire;

import ecad.wire.Wire;
import ecad.wire.WireGroup;
import java.util.ArrayList;

/**
{@link Wire}を管理するクラスです.
{@link WireGroup}とともにWireグループを形成します.
@author haru jisaku
*/
public class Wires {
	ArrayList<Wire> wire = new ArrayList<Wire>();
	ArrayList<ArrayList<Integer>> id = new ArrayList<ArrayList<Integer>>();
	WireGroup wireGroup=new WireGroup(id,wire);
	/**
* 引数は必要ありません
	*/
	public Wires(){};
/**
	* Wireを追加します.
	@param startPosX 追加する{@link Wire}の始点x
	@param startPosY 追加する{@link Wire}の始点y
	@param endPosX 追加する{@link Wire}の終点x
	@param endPosY 追加する{@link Wire}の終点y
*/
	public void addWire(int startPosX,int startPosY,int endPosX,int endPosY){
		wire.add(new Wire(startPosX,startPosY,endPosX,endPosY));
	}

	public void moveWire(int id,int posX,int posY){
		wire.get(id).moveWire(posX,posY);
		wireGroup.reGroupingWire();
	}
	/**
	{@link WireGroup}でWireをグルーピングします.
	*/

	public void groupingWire(){
		wireGroup.groupingWire();
	}

	public void relativeMoveWires(int posX,int posY){
		for (int i=0,len=wire.size();i<len ;i++ ) {
			wire.get(i).relativeMoveWire(posX,posY);
		}
		wireGroup.reGroupingWire();
	}

	public void relativeMoveWireGroup(int groupId,int posX,int posY){
for ( int wireId: wireGroup.getWireIdForGroup(groupId)) {
wire.get(wireId).relativeMoveWire(posX,posY);
}

	}


	public int getGroupId(int wireId){
		return wireGroup.getGroupId(wireId);
	}

	public void reGroupingWire(){
		wireGroup.reGroupingWire();
	}

	public void removeWire(int id){
		wire.remove(id);
	}

	public int[] getWirePos(int WireId){
		int a[] = new int[4];
		a[0]=wire.get(WireId).startPosX;
		a[1]=wire.get(WireId).startPosY;
		a[2]=wire.get(WireId).endPosX;
		a[3]=wire.get(WireId).endPosY;
		return a;
	}

	public Wire getWire(int wireId){
		return wire.get(wireId);
	}
	public int getWireLength(){
		return wire.size();
	}
}
