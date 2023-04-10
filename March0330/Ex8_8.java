package March0330;
public class Ex8_8 {
	public static void main(String[] args) throws Exception{
		method1();
//		method1();  -> 선택하여 try/catch블럭으로 만들어줌
//		try {
//			method1();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
	}
	static void method1() throws Exception{
		method2();
	}
	static void method2() throws Exception{
		throw new Exception();
	}

}
