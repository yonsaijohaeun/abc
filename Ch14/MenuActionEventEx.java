package Ch14;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MenuActionEventEx extends JFrame{
	private JLabel imgLabel = new JLabel(); 
	public MenuActionEventEx() {
		setTitle("Menu에 Action 리스너 만들기 예제");
		createMenu();
		getContentPane().add(imgLabel, BorderLayout.CENTER);
		setSize(250,220);
		setVisible(true);
	}
	private void createMenu() {  
		JMenuBar mb = new JMenuBar();
		JMenuItem [] menuItem = new JMenuItem [4];
		String[] itemTitle = {"Load", "Hide", "ReShow", "Exit"};
		JMenu screenMenu = new JMenu("Screen");

		// 4개의 메뉴아이템을 Screen 메뉴에 삽입한다.
		MenuActionListener listener = new MenuActionListener();
		for(int i=0; i<menuItem.length; i++) {
			menuItem[i] = new JMenuItem(itemTitle[i]); //메뉴 아이템 생성
			menuItem[i].addActionListener(listener); 
			screenMenu.add(menuItem[i]); 
		}
		mb.add(screenMenu);
		setJMenuBar(mb);  //메뉴바를 프레임에 부착 
	
}

class MenuActionListener implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		String cmd = e.getActionCommand();
		switch (cmd) { // 메뉴 아이템의 종류 구분
		case "Load":
			if (imgLabel.getIcon() != null) 
				return; // 이미 로딩되었으면 리턴
			imgLabel.setIcon(new ImageIcon("images/banana.jpg"));
			break;
		case "Hide":
			imgLabel.setVisible(false);
			break;
		case "ReShow":
			imgLabel.setVisible(true);
			break;
		case "Exit":
			System.exit(0); //프로그램 종료 
			break;
		}
	}
}
	public static void main(String [] args) {
		new MenuActionEventEx();
	}
}
