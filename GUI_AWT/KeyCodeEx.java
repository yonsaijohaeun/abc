package GUI_AWT;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class KeyCodeEx extends JFrame {
	private JLabel la = new JLabel(); //빈 레이블 컴포넌트 생성
	
	public KeyCodeEx() {
		setTitle("Key Code 예제 : F1키:초록색, % 키 노란색");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();

		c.addKeyListener(new MyKeyListener());
		c.add(la);

		setSize(300,150);
		setVisible(true);

		//컨텐트 팬이 키 입력받을수 있도록 포커스 강제 지정
		c.setFocusable(true);  //키를 입력받을수 있도록 포커스를 준다.
		c.requestFocus();
	}
	
	//key 리스너 구현 
	class MyKeyListener extends KeyAdapter {
		public void keyPressed(KeyEvent e) {
			Container contentPane = (Container)e.getSource();
			
			//la에 입력된 키의 키 이름 문자열을 출력하여 사용자에게 보고함 
			la.setText(e.getKeyText(e.getKeyCode()));  

			if(e.getKeyChar() == '%')  //%키를 판별하기 위해 e.getKeyChar() 호출
				contentPane.setBackground(Color.YELLOW);
			else if(e.getKeyCode() == KeyEvent.VK_F1) 
				contentPane.setBackground(Color.GREEN);
		}
	}

	

	public static void main(String[] args) {
		new KeyCodeEx();

	}

}
