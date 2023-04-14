package Graphics;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GraphicsClipEx extends JFrame {
	private MyPanel panel = new MyPanel();
	public GraphicsClipEx() {
		setTitle("클리핑 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel);
		setSize(300, 400);
		setVisible(true);
	}
	class MyPanel extends JPanel {
		private ImageIcon icon = new ImageIcon("images/image0.jpg"); //이미지로딩 
		private Image img = icon.getImage(); // 이미지 객체
		public void paintComponent(Graphics g) {
			super.paintComponent(g);  
			g.setClip(100, 20, 150, 150); //(100,20)에서 150x150 부분을 클리핑 영역으로 지정 
			g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
			g.setColor(Color.YELLOW);
			g.setFont(new Font("Arial", Font.ITALIC, 40));
			g.drawString("Go Gator!!", 10, 150);  //(10,150) 위치
		}
	}
	public static void main(String [] args) {
		new GraphicsClipEx();
	}


}
