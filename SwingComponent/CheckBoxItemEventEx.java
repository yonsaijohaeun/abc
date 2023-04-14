package SwingComponent;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class CheckBoxItemEventEx extends JFrame { 
	private JCheckBox [] fruits = new JCheckBox [3];
	private String [] names = {"사과", "배", "체리"};
	private JLabel sumLabel;  //합계 계산할 레이블 

	public CheckBoxItemEventEx() {
		setTitle("체크박스와 ItemEvent 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.add(new JLabel("사과 100원, 배 500원, 체리 20000원"));

		//3개의 체크박스를 생성.컨텐트 팬에 삽입하고 Item 리스너 등록 
		MyItemListener listener = new MyItemListener();
		for(int i=0; i<fruits.length; i++) {
			fruits[i] = new JCheckBox(names[i]); //ㅜ
			fruits[i].setBorderPainted(true);
			c.add(fruits[i]);
			fruits[i].addItemListener(listener);
		}
		sumLabel = new JLabel("현재 0 원 입니다.");
		c.add(sumLabel);
		setSize(250,200);
		setVisible(true);
	}
	//Item리스너 구현 
	class MyItemListener implements ItemListener {
		private int sum = 0; // 가격의 합
		//체크박스의 선택 상태가 변하면 itemStateChanged()가 호출됨 
		public void itemStateChanged(ItemEvent e) {
			if(e.getStateChange() == ItemEvent.SELECTED) { // 상태가바뀌었는데 선택경우.
				if(e.getItem() == fruits[0]) //사과 체크박스 
					sum += 100;
				else if(e.getItem() == fruits[1]) //배 체크박스
					sum += 500;
				else  //체리 체크박스 
					sum += 20000;
			}
			else { //해제경우 
				if(e.getItem() == fruits[0])  //사과
					sum -= 100;
				else if(e.getItem() == fruits[1])  //배
					sum -= 500;
				else  //체리 
					sum -= 20000;
			}
			sumLabel.setText("현재 "+ sum + "원 입니다.");
		}
	}

	public static void main(String [] args) {
		new CheckBoxItemEventEx();
	}
}



