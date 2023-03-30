package ch04;
public class AddEx {
	public static void main(String[] args) {
		int a = 5, b = 6;
		Add obj1 = new Add();
		System.out.println(a +"," +b);
		System.out.println(obj1.sum(a,b));
		System.out.println(a +"," +b);
		
		
	}
}
class Add {
	public int sum(int a, int b) {
		a++; b++;
		return a+b;
	}
	public int sub(int a, int b) {
		return a-b;		
	}
}

