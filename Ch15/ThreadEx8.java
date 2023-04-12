package Ch15;
import javax.swing.JOptionPane;
public class ThreadEx8 {   
	public static void main(String[] args) {  
		ThreadEx8_1 t1 = new ThreadEx8_1();
		ThreadEx8_2 t2 = new ThreadEx8_2(); 
		t2.setPriority(9);  //t2의 우선순위를 9로 바꿈. 숫자가 클수록 우선순위가 높다. 
		System.out.println("Priority of t1(-):"+t1.getPriority());
		System.out.println("Priority of t2(|):"+t2.getPriority());
		t1.start(); t2.start();
		
	}
}
class ThreadEx8_1 extends Thread {  //쓰레드1
	public void run() { 
		for(int i=0; i<300; i++) {
			System.out.print("-");
			for(int j=0; j<10000; j++);  
		}
	}
}
class ThreadEx8_2 extends Thread {  //쓰레드2
	public void run() { 
		for(int i=0; i<300; i++) {
			System.out.print("|");
			for(int j=0; j<10000; j++);
				
			
		}
	}
}