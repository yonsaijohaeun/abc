package GUI_AWT;

import java.awt.Container;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.JLabel;

public class MouseListenerEx extends JFrame{  
	private JLabel la = new JLabel("Hello");
	
	public MouseListenerEx() {   //생성자 
		setTitle("Mouse 이벤트 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.addMouseListener(new MyMouseListener());  //ContentPane에 리스너 달아줌 
		
		c.setLayout(null);  // 레이아웃을 비움 
		la.setSize(50,20);  //라벨의 크기 
		la.setLocation(30,30); //라벨의 위치 
		c.add(la);  //컨텐트팬에라벨 붙임 
		
		setSize(250,250);
		setVisible(true);
	}
	//class MyMouseListener implements MouseListener {  마우스리스너 인터페이스에 있는 메소드 
	class MyMouseListener extends MouseAdapter {  //Adapter 클래스 사용 .   
		public void mousePressed(MouseEvent e) {
			int x = e.getX();  //프레임 안에 위치 
			int y = e.getY();  //프레임 안에 위치 
			la.setLocation(x,y);  //이벤트 일어난 좌표로 hello라벨이 따라다님 
			
		}
//		public void mouseReleased(MouseEvent e) {}
//		public void mouseClicked(MouseEvent e) {}
//		public void mouseEntered(MouseEvent e) {}
//		public void mouseExited(MouseEvent e) {}
		
	}
	public static void main(String[] args) {
		new MouseListenerEx();

	}

}
