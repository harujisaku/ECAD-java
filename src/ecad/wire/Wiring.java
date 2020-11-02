package ecad.wire;

import ecad.wire.Wires;
import java.util.ArrayList;
/**
* 配線を管理するクラスです.
* 配線グループ自体の追加、削除、編集を担当します.
* @author haru jisaku
*/
public class Wiring{
	ArrayList<Wires> wires = new ArrayList<Wires>();
	/**
	* コンストラクタに引数は必要ありません.
	*/
	public Wiring(){

	}
	/**
	* testメソッドです.
	* "Wiring"とprintします.
	*/
	public void test(){
		System.out.println("Wiring");
	}
	/**
	* addWiresメソッドです.
	* wiresを追加します.
	*/
	public void addWires(){
		wires.add(new Wires());
	}
	/**
	Wiresを削除します.
	Wiresを削除しますがWireではないので注意してください。
	@param wiresId 削除するWiresを指定します
	*/
	public void removeWires(int wiresId){
		wires.remove(wiresId);
	}
	/**
	Wireを削除します.
	@param wiresId 削除するWireの所属するWiresを指定します.
	@param wireId 削除するWireを指定します.
	*/
	public void removeWire(int wiresId,int wireId){
		wires.get(wiresId).removeWire(wireId);
	}
/**
* addWireメソッドです.
* 必ず一つの線分として表せる座標を入力してください.
* @param id Wiresのid
* @param startPosX 配線の始点のX座標値です.
* @param startPosY 配線の始点のY座標値です.
* @param endPosX 配線の終点のX座標値です.
* @param endPosY 配線の終点のY座標値です.
*/
	public void addWire(int id,int startPosX,int startPosY,int endPosX,int endPosY){
		while (id>=wires.size()) {
			wires.add(new Wires());
		}
		wires.get(id).addWire(startPosX,startPosY,endPosX,endPosY);
	}

	public void addWire(String id,String startPosX,String startPosY,String endPosX,String endPosY){
		addWire(Integer.parseInt(id),Integer.parseInt(startPosX),Integer.parseInt(startPosY),Integer.parseInt(endPosX),Integer.parseInt(endPosY));
	}
/**
{@link Wires#groupingWire}でグループ化します。
@param id Wiresのid番目をグループ化します。
*/
	public void groupingWire(int id){
		wires.get(id).groupingWire();
	}
/**
Wireを移動します.
@param wiresId 移動するWiresを指定します.
@param wireId 移動するWireを指定します.
@param posX 移動先X座標を指定します.値が0未満の場合値を変更しません.
@param posY 移動先Y座標を指定します.値が0未満の場合値を変更しません.
*/
	public void moveWire(int wiresId,int wireId,int posX,int posY){
		wires.get(wiresId).moveWire(wireId,posX,posY);
	}
/**
Wiresを相対位置指定移動します.
@param wiresId 移動するWiresを指定します.
@param posX 移動加算分X座標を指定します.
@param posY 移動加算分Y座標を指定します.
*/

	public void relativeMoveWires(int wiresId,int posX,int posY){
		wires.get(wiresId).relativeMoveWires(posX,posY);
	}
	/**
	グループごとに相対移動.
	指定したグループに含まれるWire全てに相対位置指定移動をします。{@link getGroupId(int ,int)}などでgroupIdを入手してください
	@param wiresId 移動するWireの所属するWiresを指定します.
	@param groupId 移動するWireの所属するグループ
	@param posX 移動分X座標
	@param posY 移動分Y座標
	*/
	public void relativeMoveWireGroup(int wiresId,int groupId,int posX,int posY){
		wires.get(wiresId).relativeMoveWireGroup(groupId,posX,posY);
	}
	/**
	グループidを返します。
	@param wiresId 検索するWiresのid
	@param wireId 検索するWireのId
	*/
public int getGroupId(int wiresId,int wireId){
	return wires.get(wiresId).getGroupId(wireId);
	}
	/**
	再グルーピングします.
	内部的に4重forループ+whileループがあります。Wiresの状態が変わったときなどの実行にとどめてください。またWireを追加したときはreGroupingWireではなく{@link Wiring#groupingWire(int)}を実行してください。
	*/
	public void reGroupingWire(int wiresId){
		wires.get(wiresId).reGroupingWire();
	}
	public int getWiresLength(){
		return wires.size();
	}

	public int getWireLength(int wiresId){
		return wires.get(wiresId).getWireLength();
	}

	public int[] getWirePos(int WiresId,int WireId){
		return wires.get(WiresId).getWirePos(WireId);
	}

	public Wires getWires(int wiresId){
		return wires.get(wiresId);
	}

	public Wire getWire(int wiresId,int wireId){
		return wires.get(wiresId).getWire(wireId);
	}
}
