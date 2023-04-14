package SwingComponent;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class RadioButtonEx extends JFrame{
	public RadioButtonEx() {
		setTitle("라디오버튼 만들기 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		ImageIcon cherryIcon = new ImageIcon("images/cherry.jpg" );
		ImageIcon selectedCherryIcon = new ImageIcon("images/selectedCherry.jpg"); 
		
		//버튼 그룹 객체 생성
		ButtonGroup g = new ButtonGroup();
		//라디오버튼 3개 생성
		JRadioButton apple = new JRadioButton("사과");
		JRadioButton pear = new JRadioButton("배", true);
		JRadioButton cherry = new JRadioButton("체리", cherryIcon); //이미지 라디오 버튼
		cherry.setBorderPainted(true);//이미지 라디오버튼 외곽선 출력
		cherry.setSelectedIcon(selectedCherryIcon); //선택상태이미지 출력
  
		//버튼 그룹에 3개의 라디오버튼 삽입 
		g.add(apple);
		g.add(pear);
		g.add(cherry);

		//컨텐트팬에 3개의 라디오 버튼 삽입 
		c.add(apple);
		c.add(pear);
		c.add(cherry);
		setSize(250,150);
		setVisible(true);
	}
	public static void main(String [] args) {
		new RadioButtonEx();
	}

}
