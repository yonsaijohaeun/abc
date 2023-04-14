package Graphics;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.*;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class GraphicsDrawLineMouseEx extends JFrame {
	private MyPanel panel = new MyPanel();
	public GraphicsDrawLineMouseEx() {
		setTitle("drawing Line by Mouse 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel);
		setSize(300, 300);
		setVisible(true);
	}

	public static void main(String [] args) {
		new GraphicsDrawLineMouseEx();
	}
	
	
	//선을 그릴 수 있는 패널을 구현한다.
	//이 패널에 Mouse 리스너를 구현한다.
	class MyPanel extends JPanel {
		//그려진 선을 모두 ㅅ저장하기 위해 시작점은 vstart에
		//끝점은 vend 벡터에 각각 저장
		private Vector<Point> vStart = new Vector<Point>(); //Point만 저장하는 제네릭 벡터
		private Vector<Point> vEnd = new Vector<Point>(); //Point만 저장하는 제네릭 벡터
		public MyPanel() {
			//Mouse 리스너를 등록한다
			//이 리스너는 마우스 버튼이 눌러지면 마우스 포인터(시작점)를 vStart 벡터에 저장
			//마우스 버튼이 놓여지면 마우스 포인터(끝점)를 vEnd 벡터에 기억
			addMouseListener(new MouseAdapter(){
				public void mousePressed(MouseEvent e) {
					Point startP = e.getPoint(); //마우스 포인터를 알아낸다.
					vStart.add(startP); //시작점을 vStart에 저장
				}
				public void mouseReleased(MouseEvent e) {
					Point endP = e.getPoint(); //마우스 포인터를 알아낸다.
					vEnd.add(endP); //끝점을 vEnd에 저장
					
					//패널에 다시 그리기를 요청 
					repaint();
				}
			});
		}

		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.BLUE);  //파란색 선택 
			
			//벡터의 크기만큼 루프 돌면서 선을 그린다
			for(int i=0; i<vStart.size(); i++) { //vstart 벡터의 크기는 만들어진 선의 개수와 동일
				Point s = vStart.elementAt(i); //벡터에 들어있는 시작점을 알아낸다.
				Point e = vEnd.elementAt(i);  //벡터에 들어있는 끝점을 알아낸다.
				
				//시작점에서 끝점까지 선을 그린다
				g.drawLine((int)s.getX(), (int)s.getY(), (int)e.getX(), (int)e.getY());
			}
		}
	}
}
