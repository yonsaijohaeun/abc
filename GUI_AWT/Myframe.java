package GUI_AWT;

//import java.awt.HeadlessException;  -> Frame으로 했을때 import문 

import javax.swing.JFrame;

public class Myframe extends JFrame {
	
	public Myframe()  { //source-> superclass -> Frame
		setTitle("300X300 AWT 프레임 만들기"); //프레임의 제목
		setSize(300,300); //사이즈 지정
		setVisible(true); //프레임 출력
	}

	public static void main(String[] args) {
		Myframe f = new Myframe();  
	}

}
