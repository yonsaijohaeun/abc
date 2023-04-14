package GUI_AWT;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MouseListenerAllEx extends JFrame {
	private JLabel la = new JLabel("No Mouse Event");  //라벨 처음 띄울때 
	private JLabel la2 = new JLabel("color RGB");  
	
	
	public MouseListenerAllEx() {
		setTitle("MouseListener와 MouseMotionListener 예제"); 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		MyMouseListener listener =  //리스너 붙임 
				new MyMouseListener();
		c.addMouseListener(listener);  //마우스리스너 달아줌
		c.addMouseMotionListener(listener);  //마우스모션 리스너 달아줌 

		c.add(la);
		c.add(la2);

		setSize(300,200);
		setVisible(true);
	}

	class MyMouseListener implements MouseListener, 		
	MouseMotionListener {
	public void mousePressed(MouseEvent e) {
    la.setText("mousePressed ("+e.getX()+", "+e.getY ()+")");  //x,y좌표 찍힘 
    }
	public void mouseReleased(MouseEvent e) {
	la.setText("MouseReleased("+e.getX()+", "+e.getY()+")"); 		}
	public void mouseClicked(MouseEvent e) {
		if(e.getClickCount() == 2) {  //더블클릭 
			int r = (int)(Math.random()*256);
			int g = (int)(Math.random()*256);
			int b = (int)(Math.random()*256);
			Component c = (Component)e.getSource(); 
			c.setBackground(new Color(r,b,g)); 
			la2.setText("red: "+r+", green: "+g+",blue: "+b);
			
			
		}
	}
	public void mouseEntered(MouseEvent e) {
	Component c = (Component)e.getSource(); 
	c.setBackground(Color.CYAN);
	}
	public void mouseExited(MouseEvent e) {
	Component c = (Component)e.getSource();
	c.setBackground(Color.YELLOW);
	}
	
	public void mouseDragged(MouseEvent e) {
	la.setText("MouseDragged ("+e.getX()+","+e.getY()+")");
	}
	public void mouseMoved(MouseEvent e) {
	la.setText("MouseMoved ("+e.getX()+","+e.getY()+")");
	}
	}

	public static void main(String[] args) {
		new MouseListenerAllEx();
	}

}
