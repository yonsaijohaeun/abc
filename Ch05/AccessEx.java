package Ch05;
public class AccessEx {
	public static void main(String[] args) {
		Sample aClass = new Sample();
		aClass.a = 10;
		aClass.b = 10;         //private에선 접근 불가능 
		aClass.c = 10;
		
	}
}
class Sample {
	public int a;
	private int b;
	int c;
}

