package Ch15;
public class ThreadEx3 {   //main()과 run()이 독립적이기때문에 main()이 먼저 출력된다. 
	public static void main(String[] args) throws Exception{
		ThreadEx3_1 t1 = new ThreadEx3_1();
		t1.run();
	}
}
class ThreadEx3_1 extends Thread {
	public void run() {		
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