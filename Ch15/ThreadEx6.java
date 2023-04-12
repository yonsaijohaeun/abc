package Ch15;
import javax.swing.JOptionPane;
public class ThreadEx6 {  //싱글쓰레드 
	public static void main(String[] args) {  //값을 입력할때까지 기다렸다가 숫자 찍힘 
		String input = JOptionPane.showInputDialog("임의의 값을 입력하세요.");
		for(int i=0; i<10; i++) {
			System.out.print(i+" ");
			try {
				Thread.sleep(1000);  //1초씩 쉬어라.  
            } catch (InterruptedException e) {
				e.printStackTrace();
            }
		}
		System.out.println("입력하신 값은 "+input+"입니다.");
	}
}
