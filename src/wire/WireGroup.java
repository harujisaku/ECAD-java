package wire;
import wire.Wire;
import java.util.*;
import collision.Collision;
/**
Wireを管理するグループのグループ化をするクラスです.
@author haru jisaku
*/
public class WireGroup{
	/**
	*
	*/
	ArrayList<ArrayList<Integer>> id;
	ArrayList<Wire> wire;
	/**
	* IntegerのArrayListのArraiListとWireのArrayListが必要です.
	@param id [[1,2],[3,4,5,6],[7]]のようにWireのidを保存します.
	@param wire 座標を取得するために{@link Wire}のArrayListが必要です.
	*/
	public WireGroup(ArrayList<ArrayList<Integer>> id,ArrayList<Wire> wire){
		this.id=id;
		this.wire=wire;
	}
	/**
	*{@link Wire}のグルーピングをします.接触している場合グループ化されます.
	*/
	public void groupingWire(){
		while(groupingWireLoop()){}
	}

	private boolean groupingWireLoop(){
		for (int i=0,len=id.size();i<len ;i++ ) {
			ArrayList<Integer> a = new ArrayList<Integer>();
			for (int j=0,lenj=id.get(i).size();j<lenj ;j++ ) {
				for (int k=0,lenk=id.size();k<lenk ;k++ ) {
					if(k==i){
						continue;
					}
					for (int l=0,lenl=id.get(k).size();l<lenl ;l++ ) {
						if ( (Collision.testLineLine(wire.get(id.get(i).get(j)),wire.get(id.get(k).get(l))))) {
							a=new ArrayList<Integer>(id.get(k));
							id.get(i).addAll(a);
							id.remove(k);
							return true;
						}
					}
				}
			}
		}
		return false;
	}

	public void reGroupingWire(){
		id.clear();
		for (int i=0,len=wire.size();i<len ;i++ ) {
			ArrayList<Integer> a = new ArrayList<Integer>();
			a.add(i);
			id.add(a);
		}
		groupingWire();
	}

	public int getGroupId(int wireId){
		for (int i=0,leni=id.size();i<leni ;i++ ) {
			if (id.get(i).indexOf(wireId)!=-1) {
				return i;
			}
		}
		return -1;
	}

	public int[] getWireIdForGroup(int groupId){
		// Integer[] a = id.get(groupId).toArray(new Integer[0]);
		int[] intArray = new int[id.get(groupId).size()];
		for (int i=0; i<id.get(groupId).size(); i++) {
			intArray[i] = id.get(groupId).get(i); // Integer
		}
		return intArray;
	}
}
