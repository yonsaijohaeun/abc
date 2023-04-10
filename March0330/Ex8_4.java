package March0330;

public class Ex8_4 {
	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
	
		try {
			System.out.println(3);
			System.out.println(0/0);
			System.out.println(4);
		} catch (ArithmeticException e) {
//			if (e instanceof ArithmeticException ) {
//				System.out.println("true");
//			}		
			e.printStackTrace();
			System.out.println("예외메세지 : "+e.getMessage());	
	    } catch (Exception e) {  //수행하지 않음 
		    System.out.println("Exception");
		    e.printStackTrace();
	    }
		System.out.println(6);
	}

}
