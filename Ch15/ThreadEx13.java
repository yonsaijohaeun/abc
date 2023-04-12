package Ch15;
import java.util.*;
import javax.swing.JOptionPane;

public class ThreadEx13 {  
	public static void main(String[] args) {
		ThreadEx13_1 t1 = new ThreadEx13_1(); 
		t1.start(); 
		System.out.println("isInterrupted()"+t1.isInterrupted());  //상태값 false 
		String input = JOptionPane.showInputDialog("아무값이나 입력 : ");
		System.out.println("입력값은 "+input+"입니다.");
		t1.interrupt();
		System.out.println("main() isInterrupted()"+t1.isInterrupted());
		System.out.println("main() interrupted()"+t1.interrupted());  //알려주면서 false로 초기화
		System.out.println("<<main  종료>>");
	}	
}
class ThreadEx13_1 extends Thread {
	public void run() {
		int i = 10;
		while(i!=0 && !isInterrupted()) { //true && true  = true
			System.out.println(i--);
			for(long x=0; x<2500000000L; x++);
		}
		System.out.println("t1.isInterrupted()"+this.isInterrupted());
		System.out.println("t1.interrupted()"+Thread.interrupted());
	}
}
