package Ch06;
public class ReturnTest {
	public static void main(String[] args) {
		ReturnTest rt = new ReturnTest();
		int result = rt.add(3,5);
		System.out.println(result);
		int[] result2 = {0};
		rt.add(8, 7, result2);
		System.out.println(result2[0]);    //main 메소드의 지역변수: rt, result, result2

	}
	int add(int a, int b) {
		return a+b;
	}
	void add(int a, int b, int[] result) {
		 result[0] = a+b;
	} 

}
