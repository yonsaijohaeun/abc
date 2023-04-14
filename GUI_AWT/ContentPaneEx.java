package GUI_AWT;

import java.awt.*;
import java.awt.Container;
import javax.swing.*;

public class ContentPaneEx extends JFrame{
	public ContentPaneEx() {
		setTitle("ContentPane & JFrame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 닫기버튼 잘 동작
		Container contentPane = getContentPane();
		contentPane.setBackground(Color.orange);
		contentPane.setLayout(new FlowLayout());
	    contentPane.add(new JButton("OK"));
	    contentPane.add(new JButton("Cancel"));
	    contentPane.add(new JButton("Ignore"));
	    
	    setSize(300,150);
	    setVisible(true);
	}
	public static void main(String[] args) {
		new ContentPaneEx();
		System.out.println("main() is terminated");
//		System.exit(0);  

	}

}
