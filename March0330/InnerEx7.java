package March0330;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class InnerEx7 extends JFrame{
    public InnerEx7() {
        setTitle("Action Button"); //Frame의 제목
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //프로세스 종료문
        Container c = getContentPane();  //getContentPane: swing 패키지에 있음
        c.setLayout(new FlowLayout());
        
		JButton btn = new JButton("Start");
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButton b = (JButton)e.getSource();
				if(b.getText().equals("Start")) {   //'start'를 누르면 'end', 'end'를 누르면 'start'로
					b.setText("End");
				}else
					b.setText("Start");
		        //System.out.println("ActionEvent occurred!!!");
		    }
		});
		c.add(btn);
		setSize(350,150);
		setVisible(true);
    }
	public static void main(String[] args) {
		new InnerEx7();
	}
}
//class EventHandler implements ActionListener {
//	public void actionPerformed(ActionEvent e) {
//		System.out.println("ActionEvent occurred!!!");
//	}
//}

