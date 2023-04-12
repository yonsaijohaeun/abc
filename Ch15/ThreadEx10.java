package Ch15;
public class ThreadEx10 implements Runnable{  
	static boolean flag = false; 
	public static void main(String[] args) {
		Runnable r = new ThreadEx10();
		Thread t1 = new Thread(r);
		t1.setDaemon(true); //쓰레드를 데몬 쓰레드로 변경 
//		t1.setDaemon(false) : 종료했는데도 계속 저장함. 데몬 쓰레드로 지정하지 않았을 때와 똑같음.
		t1.start();
		for(int i=0; i<10; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {}
			System.out.println(i);
			if(i == 5) 
				flag = true;
				
			
		} //for문 종료 
		System.out.println("프로그램 종료");
	}
	public void run() {
		while(true) {
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {}
			if(flag) {  //flag 값이 true면 autoSave
				autoSave();
			}
		}
	}
	public void autoSave() {
		System.out.println("파일이 자동저장되었습니다.");
	}
}