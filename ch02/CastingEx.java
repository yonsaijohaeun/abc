package ch02;

public class CastingEx {
	public static void main(String[] args) {
		long m = 25;
		System.out.println(m);
		double d = 3.14 * 10;       // dounle 타입은 결과도 double 
		System.out.println(d);
	
		int n = 300;
		byte b = (byte)n;         // int n을 byte 타입으로 캐스팅 
		System.out.println(b);
		d = 1.9;
		n = (int)d;             // double d를 int로 캐스팅 
		System.out.println(n);
				
		
	}

}
