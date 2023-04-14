package GUI_AWT;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MouseWheelFrame extends JFrame{
	public MouseWheelFrame() {
		super("마우스 휠을 굴려 폰트 크기 조절");  //프레임 창 타이틀 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JLabel label = new JLabel("Love Java");
		c.add(label);
		label.setFont(new Font("Arial",Font.PLAIN,15));  //라벨 포트 지정. 폰트 객체 만듦15픽셀 크기
		label.addMouseWheelListener(new MouseWheelListener() { //마우스휠리스너: 인터페이스 
			
			@Override
			public void mouseWheelMoved(MouseWheelEvent e) {  //마우스휠무브드 메소드. 이벤트 발생시 객체 받음
				int n = e.getWheelRotation();
				if(n<0) {  //up direction. 폰트 작게 
					JLabel la = (JLabel)e.getSource();
					Font f = la.getFont();
					int size = f.getSize();//폰트의 사이즈 얻어옴 
					if(size <= 5) 
						return;
					la.setFont(new Font("Arial", Font.PLAIN,size-5));  //5씩 작아짐 
				}
				else {  //down direction. 폰트 작게 
					JLabel la = (JLabel)e.getSource();
					Font f = la.getFont();
					int size = f.getSize();
					la.setFont(new Font("TimesRoman", Font.PLAIN,size+5)); //5씩 커짐 
				}
			}
		});
		setSize(300,150);
		setVisible(true);
	}

	public static void main(String[] args) {
		new MouseWheelFrame();
	}

}
