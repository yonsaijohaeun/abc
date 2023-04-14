package GUI_AWT;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
public class AnonyClass extends JFrame{
		public AnonyClass() {
			setTitle("Action 이벤트 리스너 작성");
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			Container c = getContentPane();
			c.setLayout(new FlowLayout());
			JButton btn = new JButton("Action");
			btn.addActionListener(new ActionListener() // 익명클래스는 이름을 지워야한다
			{
				public void actionPerformed(ActionEvent e) {  //이벤트 객체를 . 레퍼런스가 없기 때문에 다른 곳에서 부를 수 없음 
					JButton b = (JButton)e.getSource();  //그 이벤트가 일어난 곳 . 이벤트 원래 타입으로 되돌려줌, 캐스팅
					if(b.getText().equals("Action"))  //영문문자열이면 한글로, 아니면 다시 영어로 
						b.setText("액션"); 
					else
						b.setText("Action");			
				}
			});
			c.add(btn);

			setSize(350, 150); // 큰 패널 사이즈  
			setVisible(true);	
		}
		
		public static void main(String [] args) {
			new IndepClassListener();
		}
	}
