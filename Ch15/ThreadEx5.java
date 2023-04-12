package Ch15;
public class ThreadEx5 {  
	static long startTime = 0;  
	public static void main(String[] args) {  
		ThreadEx5_1 t1 = new ThreadEx5_1();
		startTime = System.currentTimeMillis();
		t1.start();  //run()가 독립적으로 실행됨. main메서드하고 또다른 호출스택을 만들어서 작업함 
		for(int i=0; i<500; i++) {
			System.out.printf("%s",new String("-"));
		}	
		System.out.println("소요시간1: "+(System.currentTimeMillis()-startTime));
	}
}
class ThreadEx5_1 extends Thread {
	public void run() {
		for(int i=0; i<500; i++) {
			System.out.printf("%s",new String("|"));
		}
		System.out.println("소요시간2: "+(System.currentTimeMillis()-ThreadEx5.startTime));
	}
}

