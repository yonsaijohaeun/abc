package Ch05;
class StaticSample{
	public int n;
	public void g() {
		m = 20;
	}
	public void h() {
		m = 30;
	}
	public static int m;
	public void f() {
		m = 5;
	}
}
public class StaticEx {
	public static void main(String[] args) {
		StaticSample s1, s2;
		s1 = new StaticSample();
		s1.n = 5;
	    s1.g();
	    s1.m = 50;          //50이 20으로 바뀜
		s2 = new StaticSample();
		s2.n = 8;
	    s2.h();           //m 값이 30으로 바뀜
	    s2.f();           //m값이 5로 바뀜
	    //StaticSample.f(); 로 원래는 부름. 지금은 같은 클래스라 그냥 써도됨.
	    System.out.println(s1.m);
	}

}
