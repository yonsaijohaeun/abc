package Ch14;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MenuEx extends JFrame {
	public MenuEx() {
		setTitle("Menu 만들기 예제");
		createMenu(); // 메뉴 생성, 프레임에 삽입
		setSize(250,200);
		setVisible(true);
	}
	
	//메뉴를 만들어 프레임에 삽입한다
	private void createMenu() {
		JMenuBar mb = new JMenuBar();  //메뉴바 생성 
		JMenu screenMenu = new JMenu("Screen"); //Screen 메뉴 생성

		//Screen 메뉴에 메뉴 아이템 생성 삽입
		screenMenu.add(new JMenuItem("Load"));
		screenMenu.add(new JMenuItem("Hide"));
		screenMenu.add(new JMenuItem("ReShow"));
		screenMenu.addSeparator(); // 분리선 삽입
		screenMenu.add(new JMenuItem("Exit"));

		//메뉴바에 메뉴 삽입 
		mb.add(screenMenu);  //Screen 메뉴 삽입
		mb.add(new JMenu("Edit"));  //edit 메뉴 생성삽입
		mb.add(new JMenu("Source"));
		mb.add(new JMenu("Project"));
		mb.add(new JMenu("Run"));
		//메뉴바를 프레임에 부착
		setJMenuBar(mb);
	}
	public static void main(String [] args) {
		new MenuEx();
	}


}
