package Graphics;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GraphicsDrawImageEx extends JFrame {
	private MyPanel panel = new MyPanel();
	public GraphicsDrawImageEx() {
		setTitle("원본 크기로 원하는 위치에 이미지 그리기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel);		
		setSize(300, 420);
		setVisible(true);
	}
	class MyPanel extends JPanel {
		private ImageIcon icon = new ImageIcon("images/image0.jpg");  //이미지 로딩
		private Image img = icon.getImage(); // 이미지 객체. 그래픽 객체가 그려줌 
		public void paintComponent(Graphics g) { //그래픽 객체 들어옴 
			super.paintComponent(g);
			//이미지를 패널의(20,20)에 원래의 크기를 그린다. 
			g.drawImage(img, 20, 20, this);
		}
	}
	public static void main(String [] args) {
		new GraphicsDrawImageEx();
	}

}
