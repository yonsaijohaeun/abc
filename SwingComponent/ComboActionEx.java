package SwingComponent;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ComboActionEx extends JFrame {
	private String [] fruits = {"apple", "banana", "kiwi", "mango"};
	private ImageIcon [] images = { new ImageIcon("images/apple.jpg"), //이미지 객체 배열
									new ImageIcon("images/banana.jpg"),
									new ImageIcon("images/kiwi.jpg"),
									new ImageIcon("images/mango.jpg")};
	private JLabel imgLabel = new JLabel(images[0]); //이미지 레이블 컴포넌트. 레이블에 배열의 인덱스를 줌  
	private JComboBox<String> strCombo = new JComboBox<String>(fruits); //문자열 콤보 박스 

	public ComboActionEx() {
		setTitle("콤보박스 활용 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.add(strCombo);
		c.add(imgLabel);

		//액션 리스너 등록 
		strCombo.addActionListener(new ActionListener() {  //콤보박스에 액션리스너 붙임 
			public void actionPerformed(ActionEvent e) {
				JComboBox<String> cb = (JComboBox<String>)e.getSource(); 
				int index = cb.getSelectedIndex(); //콤보박스의 선택된 아이템의 인덱스 번호 알아내기 
				imgLabel.setIcon(images[index]); //인덱스의 이미지를 이미지 레이블 컴포넌트에 출력 
			}
		});
		setSize(300,250);
		setVisible(true);
	}
	public static void main(String [] args) {
		new ComboActionEx();
	}
}
