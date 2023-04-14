package SwingComponent;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class TextAreaEx extends JFrame{
	private JTextField tf = new JTextField(20);
	private JTextArea ta = new JTextArea(7, 20);  //한줄에 20개 입력 가능. 7줄 입력창

	public TextAreaEx() {
		setTitle("텍스트영역 만들기 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		c.add(new JLabel("입력 후 <Enter> 키를 입력하세요"));
		c.add(tf);  //textfield 붙임
		c.add(new JScrollPane(ta)); //textarea 스크롤 팬에 담아서 붙임 

		//텍스트 필드에 엔터 키 입력할떄 발생하는 Action이벤트의 리스너 등록
		tf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JTextField t = (JTextField)e.getSource();  //텍스트 필드 갖고옴 
				ta.append(t.getText() + "\n");  //텍스트 필드의 문자열을 텍스트 영역 창에 붙임 
				t.setText(""); //햔제 텍스트필드에 입력된 내용 지우기. 이게 없으면 텍스트필드에 전에 입력한게 남음 
			}
		});
		setSize(300,300);
		setVisible(true);
	}
	public static void main(String [] args) {
		new TextAreaEx();
	}

}
