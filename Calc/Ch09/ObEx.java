package Ch09;

public class ObEx {
	int x,y;
	static int z;
	int add(int a, int b) {
		return a+b;
	}
	static int add2(int a, int b) {
		return a+b+1;
				
	}
	void test() {
		System.out.println(add(5,4));
		System.out.println(add2(5,4));
	}
    public static void main(String[] args) {    //Run이 안되면 main메소드 넣어라.
    	//test();
    	ObEx o1 = new ObEx();
    	o1.test();
    	System.out.println(ObEx.z);
    }
 
}
