import wire.Wiring;
/**
* ECADのメインとなるクラスです。
* @author haru jisaku
*/

public class ECAD{

	/**
	*クラスフィールドです。
	*/

	public static void main(String[] args) {

		/**
		* mainメソッドです。
		* Wiringを使います。
		*/

		System.out.println("HelloWorld");
		Wiring w=new Wiring();
		w.test();
		a();
	}
	public void test(){
		System.out.println("test");
	}

	public static void a(){
		System.out.println("dfsafdjflsajf");
	}
}
