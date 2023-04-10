package March0330;

public class InnerTest {
	public static void main(String[] args) {
		System.out.println(OuterEx.InstanceInner.CONST);
		System.out.println(OuterEx.staticInner.cv);

	}

}
class OuterEx{
	class InstanceInner{
		int iv = 100;
		int cv = 100;    // static int cv = 100; 에서 'static' 변수 사용 불가. 
		final static int CONST = 100;
	}
	static class staticInner {
		int iv = 200;
		static int cv = 200;
	}
	void myMethod() {
		class LocalInner {
			int iv = 300;
			int cv = 300;   // static int cv = 100; 에서 'static' 변수 사용 불가. 
			final static int CONST = 300;		
		}
		
	}
}
