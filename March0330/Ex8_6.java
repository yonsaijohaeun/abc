package March0330;
class TestA{
	void method() {System.out.println("TestA' method()");}
}
public class Ex8_6 {
	public static void main(String[] args)  {
		try {
			int[] arr = new int[10];
			//System.out.println(arr[0]);  //'0' 출력
			System.out.println(arr[10]);  //ArrayIndexOutOfBounds
		    TestA t1 = null;   //레퍼런스 타입이라 null로 초기화 해줘야 함.
		    t1.method();
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArithmeticException");
		} catch (NullPointerException e) {
			System.out.println("NullPointerException");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
