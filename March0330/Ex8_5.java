package March0330;

import java.util.Scanner;

class ExceptionA extends Exception{
	void methodA() {
		System.out.println("ExceptionA's method");
	}
	public ExceptionA(String msg) {
		super(msg);
	
	}
	
}
class ExceptionB extends Exception{
	void methodB() {
		System.out.println("ExceptionB's method");
	}
	public ExceptionB(String msg) {super(msg);}
}
public class Ex8_5 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        String input = s.next();
		try {
			if(input.equals("true")) {
			    ExceptionA e = new ExceptionA("ExceptionA");
			    throw e;
			}else {
				ExceptionB e = new ExceptionB("ExceptionB");
				throw e;
			}
		} catch (ExceptionA | ExceptionB e ) {
			if(e instanceof Exception) {
				ExceptionA ea = (ExceptionA)e;
				ea.methodA();
			}else {
				ExceptionB eb = (ExceptionB)e;
				eb.methodB();
			}
				
				
//			System.out.println(""+e.getMessage());
//			e.printStackTrace();
		}
	
	}

}
