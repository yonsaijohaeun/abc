package Ch07;
final class Singleton{
	private static Singleton s = new Singleton();
	private Singleton() {
		System.out.println("Singleton class constructor");
	}
	public static Singleton getInstance() {
		System.out.println("getInstanc() first line");
		if(s==null) {
			System.out.println("getInstanc() second line");
			s = new Singleton();
		}
		return s;
	} 
	public static void setS() {
		//this.s = null;    => static 은 this. 사용 불가
		Singleton.s = null;
	}
} 
class SingletonTest {
	public static void main(String[] args) {
		System.out.println("SingletonTest.main()");
		Singleton s = Singleton.getInstance();
		System.out.println(s);  
		s.setS();
		//s = null;  //19행의 s 
		s = Singleton.getInstance(); 
		System.out.println(s);    //레퍼런스값 출력
	}

}
