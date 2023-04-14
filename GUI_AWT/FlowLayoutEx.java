package GUI_AWT;
import java.awt.*;
import javax.swing.*;

public class FlowLayoutEx extends JFrame{
	public FlowLayoutEx() {  //생성자 작성
		setTitle("FlowLayout Sample");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		Container con = getContentPane();  //엄어옴 (contentpane을. Container는 awt패키지에서 임포트)
		con.setLayout(new FlowLayout(FlowLayout.LEFT,30,40));  //왼쪽부터 출력 30,40은 가로,세로간격 
	    con.add(new JButton("add"));
	    con.add(new JButton("sub"));
	    con.add(new JButton("mul"));
	    con.add(new JButton("div"));
	    con.add(new JButton("Calculate"));
	    
	    setSize(300,500);
	    setVisible(true);
	
}
	

	public static void main(String[] args) {
		new FlowLayoutEx();   //객체 생성 

	}

}
