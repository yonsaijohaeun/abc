package March0330;
class Outer {
	private int num = 100;
	private String name = "홍길동";
	private void methodOut() {System.out.println("outer method!!");}
	class Inner {
		double height = 180.5;
		double weight = 85.5;
		String state = "경기도 광주";
		void methodIn() {System.out.println("inner method!!");}
	    void print() {
	    	methodOut(); 
	    	System.out.println("이름 : "+name);
	    	System.out.println("몸무게 : "+weight);
	    	
	    }
	}
}
public class InnerEx1 {
	public static void main(String[] args) {
		Outer o = new Outer();
		March0330.Outer.Inner inner = o.new Inner();   // 'outer객체.new'로 해줘야 함.
		inner.methodIn();
		inner.print();
	}

}
