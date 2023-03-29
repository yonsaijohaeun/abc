package ch02;

public class Ex04_11 {

	public static void main(String[] args) {
		byte a = 'A', b;             //char 타입과 byte 타입은 호환됨. A는 아스키고드 정수값으로 들어감 
		byte mask = 0x0F;            //마스크값 16진수 4개값(0000 1111)을 설정한다.
		
		System.out.printf("%X & %X = %X \n", a, mask, a & mask);        
		System.out.printf("%X | %X = %X \n", a, mask, a | mask);      // 'A'와 0x0F \의 논리곱 및 논리합을 수행 
		
		mask = 'a' - 'A';       // a와 A의 차이는 32이다
		
		b = (byte) (a^mask);
		System.out.printf("%c ^ %d = %c \n", a, mask, b);
		a = (byte) (b^mask);
		System.out.printf("%c ^ %d = %c \n", b, mask, a);
	}

}
