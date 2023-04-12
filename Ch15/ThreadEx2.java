package Ch15;
public class ThreadEx2 {   //main()과 run()이 독립적이기때문에 main()이 먼저 출력된다. 
	public static void main(String[] args) throws Exception{
		ThreadEx2_1 t1 = new ThreadEx2_1();
		t1.start();
		System.out.println("main()");
	}
}
class ThreadEx2_1 extends Thread {
	public void run() {		
		System.out.println("run()");
		throwsException(); //throwsException() 메서드 호출
	}
	public void throwsException() {
		try {
			throw new Exception();
		} catch (Exception e) {
			System.out.println("ggbb");
//			e.printStackTrace();
		}
	}
}