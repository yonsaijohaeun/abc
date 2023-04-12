package Ch15;
public class ThreadEx01 {
	public static void main(String[] args) {
		ThreadEx1_1 t1 = new ThreadEx1_1();
		Runnable r = new ThreadEx1_2();
		Thread t2 = new Thread(r);   //생성자 Thread(Runnable target)
		t1.start();
		t2.start();
	}

}
class ThreadEx1_1 extends Thread {
	public void run() {
		for(int i=0; i<50000; i++) {
			System.out.print("-"); 
		}
	}
}
class ThreadEx1_2 implements Runnable {
	public void run() {
		for(int i=0; i<50000; i++) {
            //Thread.currentThread() 현재 실행중인 Thread	
			System.out.print("|"); 
		}
	}
}