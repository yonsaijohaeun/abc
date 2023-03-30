package Calc;
import java.util.*;       //util 패키지에 속해있는 클래스만 import
import java.util.concurrent.atomic.AtomicBoolean;
interface Phone {
   /*int TIMEOUT = 10000;    
   public abstract void sendCall();
   void receiveCall();
   default void printLogo() {
   System.out.println("** Phone **");
   };*/
	
   public static final int TIMEOUT = 10000;
   public abstract void sendCall();
   public abstract void receiveCall();
}

/*interface CellPhone extends Phone {     //인터페이스끼리 상속 가능 .
	  
	   public static final int TIMEOUT = 10000;
	   public abstract void sendCall();
	   public abstract void receiveCall();
	}*/


  interface PhoneInterface extends Phone {     
	   public static final int TIMEOUT = 10000;
	   public abstract void sendCall();
	   public abstract void receiveCall();
	   public default void print()  {
		   System.out.println("****");
	   };
  }
 class SamsungPhone implements PhoneInterface { // 인터페이스 구현
			// PhoneInterface의 모든 메소드 구현
    public void sendCall() { System.out.println("띠리리리링"); }
    public void receiveCall() { System.out.println("전화가 왔습니다."); }
    public void print() {
    	System.out.println("**SamsungPhone**");
    };
			// 메소드 추가 작성
	public void flash() { System.out.println("전화기에 불이 켜졌습니다."); }
	public static void main(String[] args) {
		PhoneInterface p1 = new SamsungPhone();
 		p1.print();
        SamsungPhone s1 = (SamsungPhone)p1;	
		p1.sendCall();
		p1.receiveCall();
		s1.flash();
		Scanner s = new Scanner(System.in);
		AtomicBoolean ab = new AtomicBoolean();
	}
			
 }
 


//abstract class Galaxy  extends Calculator implements Phone {     //인터페이스의 다중 상속 가능 
  //public void sendCall() {
	//	}
	
