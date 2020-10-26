import wire.Wiring;
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

	public void addWires(){
		wiring.addWires();
	}

	public void addWire(int id,int startPosX,int startPosY,int endPosX,int endPosY){
		wiring.addWire(id,startPosX,startPosY,endPosX,endPosY);
	}

	public void moveWire(int wiresId,int wireId,int posX,int posY){
		wiring.moveWire(wiresId,wireId,posX,posY);
	}

	public void reGroupingWire(int wiresId){
		wiring.reGroupingWire(wiresId);
	}

	public void groupingWire(int wiresId){
		wiring.groupingWire(wiresId);
	}

	public int getGroupId(int wiresId,int wireId){
		return wiring.getGroupId(wiresId,wireId);
	}

	public void relativeMoveWireGroup(int wiresId,int groupId,int posX,int posY){
		wiring.relativeMoveWireGroup(wiresId,groupId,posX,posY);
	}

	public void relativeMoveWires(int wiresId,int posX,int posY){
		wiring.relativeMoveWires(wiresId,posX,posY);
	}

	public void removeWire(int wiresId,int wireId){
		wiring.removeWire(wiresId,wireId);
	}

	public void removeWires(int wiresId){
		wiring.removeWires(wiresId);
	}

}
