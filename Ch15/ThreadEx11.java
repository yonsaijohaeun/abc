package Ch15;

import java.util.*;

public class ThreadEx11 {  
	public static void main(String[] args) {
		ThreadEx11_1 t1 = new ThreadEx11_1("ThreadEx11_1");  //기다리는 쓰레드 
		ThreadEx11_2 t2 = new ThreadEx11_2("ThreadEx11_2");  //내용 뿌리는 쓰레드
		t1.start(); t2.start();
	}	
}
class ThreadEx11_1 extends Thread {
	//source -> super 생성자 -> string
	public ThreadEx11_1(String name) { super(name);	}
	public void run() {  //5초씩 기다림
		try {   sleep(5*1000);} 
		catch (InterruptedException e) { }
	}
}
class ThreadEx11_2 extends Thread {
		public ThreadEx11_2(String name) {super(name);}
		public void run() {  //
			Map map = getAllStackTraces(); //쓰레드의 정보를 전부 갖고옴 
			Iterator it = map.keySet().iterator();
			int x = 0;
			while(it.hasNext()) {
				Object obj = it.next();
				Thread t = (Thread)obj;  // 원래 상태로 되돌림 
				StackTraceElement[] ste = (StackTraceElement[])(map.get(obj));
				System.out.println("["+ ++x +"] name: "+ t.getName()
				 					+", group : "+t.getThreadGroup().getName()
				 					+", daemon : "+t.isDaemon());
				for(int i=0; i<ste.length; i++)
					System.out.println(ste[i]);
				System.out.println();
			}
		}
		

}