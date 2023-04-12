package Ch15;
public class ThreadEx9 {   
	public static void main(String[] args) {
		ThreadGroup main = Thread.currentThread().getThreadGroup(); //현재쓰레드에 대해서 쓰레드그룹을 갖고 옴 
		ThreadGroup group1 = new ThreadGroup("Group1"); //group1,2의 부모: main
		ThreadGroup group2 = new ThreadGroup("Group2");
		//ThreadGroup(ThreadGroup parent, string name)
		ThreadGroup subGroup1 = new ThreadGroup(group1, "subGroup1");//그룹1에 속한 서브그룹1
		group1.setMaxPriority(3);
		Runnable r = new Runnable() {   //익명inner클래스처럼 . Runnable: interface  
			public void run() {  
				try {
					Thread.sleep(1000);  //1초씩 쉬어라.  
	            } catch (InterruptedException e) {  }
			}
			
		};
		//Thread(ThreadGroup group, Runnable r, String name) //생성자 
		Thread t1 = new Thread(group1,    r, "t1" );  //group1에 속하는 쓰레드 객체 생성
		Thread t2 = new Thread(subGroup1, r, "t2" );
		Thread t3 = new Thread(group2,    r, "t3" );
		t1.start();
		t2.start();
		t3.start();
		System.out.println("List of ThreadGroup : " + main.getName()
		+", ActiveGroupCount"+main.activeGroupCount()
		+", Active Thread"+main.activeCount());  //getName:이름을 찍기
												 //activeGroupCount: 쓰레드 그룹에 포함된 활성상태에 있는 쓰레의 그룹의 수를 반환(group1, group2, subGroup1)
		                                         //activeCount: 쓰레드 그룹에 포함된 활성상태에 있는 쓰레의 수를 반환 
		main.list();
	}
}