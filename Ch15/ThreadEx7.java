package Ch15;
import javax.swing.JOptionPane;
public class ThreadEx7 {  //멀티Tread. main()과 run()이 독립적으로 동시에 수행됨. 값입력하든말든 반복문 진행됨.
	public static void main(String[] args) {  
		ThreadEx7_1 t1 = new ThreadEx7_1();
		t1.start();
		String input = JOptionPane.showInputDialog("임의의 값을 입력하세요.");
		System.out.println("입력하신 값은 "+input+"입니다.");
	}
}
class ThreadEx7_1 extends Thread {
	public void run() { //run 메서드 몸통 . 메인메서드에 쓰레드 객체를 만들고 스타트 시켜야 run메서드 호출 가능
		for(int i=0; i<10; i++) {
			System.out.print(i+" ");
			try {
				Thread.sleep(1000);  //1초씩 쉬어라.  
            } catch (InterruptedException e) {
				e.printStackTrace();
            }
		}
	}
}