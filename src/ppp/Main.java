package ppp;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Main extends JFrame {
	private JPanel shapePanel;
	private Point prevPoint, curPoint;
	private JButton drawButton = new JButton("그리기");
	private JButton delete = new JButton("지우기");
	private JButton color = new JButton("색상");
	private JButton sizeButton = new JButton("굵기");
	private JLabel imageLabel = new JLabel();

//  Graphics graphics; 
//	Graphics2D g2;   =>Graphics2D 클래스의 사용을 위해 선언

	private boolean drawMode = false;
	private int size = 1;

	public Main() {
		setTitle("그림판");
		setSize(500, 500);
		createMenu();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);

		shapePanel = new JPanel();
		

		// 마우스 이벤트와 마우스 모션 이벤트를 처리
		drawButton.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        // 그리기 모드를 변경
		        drawMode = !drawMode;

		        if (drawMode) {
		            // 그리기 모드가 켜졌을 때, 마우스 이벤트와 마우스 모션 이벤트 리스너를 추가
		            shapePanel.addMouseListener(new MouseAdapter() {
		                public void mousePressed(MouseEvent e) {
		                    prevPoint = e.getPoint();
		                }

		                public void mouseReleased(MouseEvent e) {
		                    prevPoint = null;
		                }
		            });

		            shapePanel.addMouseMotionListener(new MouseAdapter() {
		                public void mouseDragged(MouseEvent e) {
		                	if (drawMode) {
		                        curPoint = e.getPoint();
		                        Graphics g = shapePanel.getGraphics();
		                        ((Graphics2D) g).setStroke(new BasicStroke(size));
		                        g.drawLine(prevPoint.x, prevPoint.y, curPoint.x, curPoint.y);
		                        prevPoint = curPoint;
		                    }
		                }
		            });
		        } else {
		            // 그리기 모드가 꺼졌을 때, 마우스 이벤트와 마우스 모션 이벤트 리스너를 제거
		            shapePanel.removeMouseListener(shapePanel.getMouseListeners()[0]);
		            shapePanel.removeMouseMotionListener(shapePanel.getMouseMotionListeners()[0]);
		        }
		    }
		});
		// 지우기 버튼 이벤트 처리 - 오동근
		delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		// 색상 버튼 이벤트 처리 - 조하은
//		color.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				String cmd = e.getActionCommand(); //메뉴아이템의 이름 리턴
//				if(cmd.equals("색상"))  {  //색상 메뉴 아이템의 경우 
//					//컬러 다이얼로그를 출력하고 사용자가 선택한 색을 알아옴
//					 Color selectedColor = JColorChooser.showDialog(null, "Color", Color.YELLOW);
//					  
//					if(selectedColor != null)
//						shapePanel.setForeground(selectedColor);
//				}
//				
//			}
//		});
	    color.addActionListener(new ActionListener() {
		          // 색상버튼 액션처리를 익명클래스로 작성
		            public void actionPerformed(ActionEvent e) { // 오버라이딩
		            Color selectedColor = JColorChooser.showDialog(null, "Color", Color.YELLOW);
		            if(selectedColor != null) {
		            	// 사용자가 선택한 색 selectedColor 사용
		            }        
		            Graphics g2 = shapePanel.getGraphics();
//		                g = (Graphics2D)Graphics; 
		            g2.setColor(selectedColor); 
		            // 그려지는 펜의 색상을 selectedColor를 매개변수로 하여 지정
		            }
		            	

		        });
		// 굵기 버튼 이벤트 처리 - 성보경
		sizeButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
              }
        });

        add(shapePanel);
    }
	
	
		
		
		
	private void createMenu() {
		JMenuBar mb = new JMenuBar();
		JMenu sMenu = new JMenu("File");
		JMenuItem openItem = new JMenuItem("열기");
		
		sMenu.add(openItem);
		sMenu.addSeparator();
		sMenu.add(new JMenuItem("저장"));

		mb.add(sMenu);
		mb.add(drawButton);
		mb.add(delete);
		mb.add(color);
		mb.add(sizeButton);
		setJMenuBar(mb);
	}

	public static void main(String[] args) {
		new Main();
	}
}
