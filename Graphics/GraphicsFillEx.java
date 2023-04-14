package Graphics;
import javax.swing.*;
import java.awt.*;

public class GraphicsFillEx extends JFrame {
	private MyPanel panel = new MyPanel();
	public GraphicsFillEx() {
		setTitle("fillXXX 사용 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel);
		setSize(100, 350);
		setVisible(true);
	}
	
	class MyPanel extends JPanel {
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.RED);
			g.fillRect(10,10,50,50);  //10,10에서 시작. 가로크기50, 세로크기50
			g.setColor(Color.BLUE);
			g.fillOval(10,70,50,50);
			g.setColor(Color.GREEN);
			g.fillRoundRect(10,130,50,50,20,20);
			g.setColor(Color.MAGENTA);
			g.fillArc(10,190,50,50,0,270); 
			g.setColor(Color.ORANGE);
			int [] x ={30,10,30,60};
			int [] y ={250,275,300,275};
			g.fillPolygon(x, y, 4);  //점이 4개 . 오렌지색 다각형 칠하기
//			g.fillPolygon(x, y, 3);  //점이 4개 . -> 삼각형 만들어짐 
//			g.fillPolygon(x, y, 5);  //에러-> 값이 4개밖에 없어서 오류 발생
			
			
		}
	}	
	public static void main(String [] args) {
		new GraphicsFillEx();
	}
}
