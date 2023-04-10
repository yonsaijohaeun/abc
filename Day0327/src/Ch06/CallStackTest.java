package Ch06;

public class CallStackTest {
    public static void main(String[] args) {
		firstMethod();
	}
    static void firstMethod() {
    	System.out.println("firstMethod()");
    	secondMethod();
    }
    static void secondMethod() {
    	System.out.println("secondMethod()");
    }

}
