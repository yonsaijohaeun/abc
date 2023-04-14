package GUI_AWT;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
public class IndepClassListener extends JFrame{
		public IndepClassListener() {
			setTitle("Action 이벤트 리스너 예제");
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //닫기버튼 구현
			Container c = getContentPane(); //컴포넌트 얻으려고
			c.setLayout(new FlowLayout()); 
			JButton btn = new JButton("Action");  //버튼객체 생성
			btn.addActionListener(new MyActionListener()); // Action 리스너 달기
			c.add(btn);

			setSize(350, 150); // 큰 패널 사이즈  
			setVisible(true);	
		}
		
		public static void main(String [] args) {
			new IndepClassListener();  //인뎁클래스 객체 생성 
		}
		private class MyActionListener implements ActionListener { 
			public void actionPerformed(ActionEvent e) {
				JButton b = (JButton)e.getSource();
				if(b.getText().equals("Action"))
					b.setText("액션");
				else
					b.setText("Action");			
			}
		}
	}

