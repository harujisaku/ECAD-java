package ecad.wire;
import ecad.wire.Wire;
import java.util.*;
import ecad.collision.Collision;
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
	内部で4重forループ+whileループがあります。連続して実行せずにWireの状態が変わったときなどの実行にとどめてください。
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
	/**
	再グルーピングします.
	移動したときなどすでに追加されているWireのグルーピングをやり直すときに使います。内部的に{@link WireGroup#groupingWire()}をループしているので時間がかかります。連続して実行せずにWireの移動時などに実行するにとどめてください。<br>
	Wireを追加するときには{@link WireGroup#groupingWire()}を呼び出してください。また今後自動で呼び出されるようになる可能性があります。
	*/

	public void reGroupingWire(){
		id.clear();
		for (int i=0,len=wire.size();i<len ;i++ ) {
			ArrayList<Integer> a = new ArrayList<Integer>();
			a.add(i);
			id.add(a);
		}
		groupingWire();
	}

	/**
	wireIdからgroupIdを検索します.
	内部的にループがかかっているので連続実行しないでください。
	@param wireId 検索するWireのId
	@return 検索して見つかったgroupIdが返されます。見つからなかった場合は-1が返されます。
	*/
	public int getGroupId(int wireId){
		for (int i=0,leni=id.size();i<leni ;i++ ) {
			if (id.get(i).indexOf(wireId)!=-1) {
				return i;
			}
		}
		return -1;
	}
/**
groupIdからwireIdの配列を返します.
@param groupId wireIdを返すWireのグループのidです。{@link WireGroup#getGroupId(int)}などでgroupIdを入手してください。
@return wireIdの配列.順番はグループに入れられた順です。

*/
	public int[] getWireIdForGroup(int groupId){
		int[] intArray = new int[id.get(groupId).size()];
		for (int i=0; i<id.get(groupId).size(); i++) {
			intArray[i] = id.get(groupId).get(i); // Integer
		}
		return intArray;
	}
}
