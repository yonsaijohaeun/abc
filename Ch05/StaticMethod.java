package Ch05;
public class StaticMethod {
	int n;
	void f1(int x) {n = x;}
	void f2(int x) {m = x;}
	static int m;
	static void s1(int x) {n = x;}
	static void s2(int x) {f1(3);}
	static void s3(int x) {m = x;}
	static void s4(int x) {s3(3);}
	public static void main(String[] args) {
		StaticMethod sm1 = new StaticMethod();

	}

}
