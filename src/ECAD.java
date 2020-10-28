import harujisaku.wire.Wiring;
import harujisaku.parts.BoardParts;
/**
* ECADのメインとなるクラスです.
* @author haru jisaku
*/

public class ECAD{
	Wiring wiring = new Wiring();
	/**
	*クラスフィールドです.
	*/
	/**
	* mainメソッドです.
	*/
	public static void main(String[] args) {

	}
	public void test(){
		System.out.println("test");
	}

	public void a(){
		System.out.println("dfsafdjflsajf");
	}
	/**
	Wiresを追加します
	*/

	public void addWires(){
		wiring.addWires();
	}
	/**
	Wireを追加します。
	@param wiresId 追加するWiresを指定します。
	@param startPosX 始点x座標
	@param startPosY 始点y座標
	@param endPosX 終点x座標
	@param endPosY 終点y座標
	*/
	public void addWire(int wiresId,int startPosX,int startPosY,int endPosX,int endPosY){
		wiring.addWire(wiresId,startPosX,startPosY,endPosX,endPosY);
	}
	/**
	Wireを移動します。Wireに仕様により0未満を指定すると値が変更されません。
	@param wiresId 移動するWireの所属するWiresを指定します.
	@param wireId 移動するWireを指定します.
	@param posX 移動先X座標
	@param posY 移動先Y座標
	*/
	public void moveWire(int wiresId,int wireId,int posX,int posY){
		wiring.moveWire(wiresId,wireId,posX,posY);
	}
	/**
	再グルーピングします.
	内部的に4重forループ+whileループがあります。Wiresの状態が変わったときなどの実行にとどめてください。またWireを追加したときはreGroupingWireではなく{@link ECAD#groupingWire(int)}を実行してください。
	*/
	public void reGroupingWire(int wiresId){
		wiring.reGroupingWire(wiresId);
	}
	/**
	{@link harujisaku.wire.Wires#groupingWire}でグループ化します。
	@param wiresId Wiresのid番目をグループ化します。
	*/
	public void groupingWire(int wiresId){
		wiring.groupingWire(wiresId);
	}
	/**
	グループidを返します。
	@param wiresId 検索するWiresのid
	@param wireId 検索するWireのId
	*/
	public int getGroupId(int wiresId,int wireId){
		return wiring.getGroupId(wiresId,wireId);
	}
	/**
	グループごとに相対移動.
	指定したグループに含まれるWire全てに相対位置指定移動をします	。{@link getGroupId(int ,int)}などでgroupIdを入手してください
	@param wiresId 移動するWireの所属するWiresを指定します.
	@param groupId 移動するWireの所属するグループ
	@param posX 移動分X座標
	@param posY 移動分Y座標
	*/
	public void relativeMoveWireGroup(int wiresId,int groupId,int posX,int posY){
		wiring.relativeMoveWireGroup(wiresId,groupId,posX,posY);
	}
	/**
	Wiresを相対移動.
	指定したWiresを相対位置指定移動します。
	@param wiresId 移動するWiresを指定します.
	@param posX 移動分X座標
	@param posY 移動分Y座標
	*/
	public void relativeMoveWires(int wiresId,int posX,int posY){
		wiring.relativeMoveWires(wiresId,posX,posY);
	}
	/**
	Wireを削除します.
	@param wiresId 削除するWireの所属するWiresを指定します.
	@param wireId 削除するWireを指定します.
	*/
	public void removeWire(int wiresId,int wireId){
		wiring.removeWire(wiresId,wireId);
	}
	/**
	Wiresを削除します.
	Wiresを削除しますがWireではないので注意してください。
	@param wiresId 削除するWiresを指定します
	*/
	public void removeWires(int wiresId){
		wiring.removeWires(wiresId);
	}
}
