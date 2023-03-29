package ch02;
public class Ex02_07 {
	public static void main(String[] args) {
		int x = 5;
		int y = 5;
		System.out.println((5<=3)&&(++x == 6));
		System.out.println(x);
		System.out.println((5<=3)&(++x == 6));
		System.out.println(x);
		System.out.println((5>=3)||(++y == 6));         //y 증가하지 않아서 5
		System.out.println(y);
		System.out.println((5>=3)|(++y == 6));          //y 증가해서 6
		System.out.println(y);
	}

}


