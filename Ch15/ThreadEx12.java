package Ch15;

import java.util.*;

public class ThreadEx12 {  
	public static void main(String[] args) {
		ThreadEx12_1 t1 = new ThreadEx12_1(); 
		ThreadEx12_2 t2 = new ThreadEx12_2();  
		t1.start(); 
		t2.start();
		try {
			Thread.sleep(2000);   // try/catch 로 묶어줘야 함. main이 2초 후에 출력함. 
		} catch (InterruptedException e) {}
		System.out.println("<<main  종료>>");
	}	
}
class ThreadEx12_1 extends Thread {
	public void run() {
		for(int i=0; i<3000; i++) 
			System.out.print("-");
		try {
			Thread.sleep(3000);   
		} catch (InterruptedException e) {
		}
		System.out.println("<<t1 종료>>");
	}
}
class ThreadEx12_2 extends Thread {
	public void run() {  
		for(int i=0; i<3000; i++) 
			System.out.print("|");
		System.out.println("<<t2 종료>>");
			
	}
}