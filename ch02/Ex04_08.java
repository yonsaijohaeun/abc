package ch02;
import java.util.Scanner;
public class Ex04_08 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		float a, b;
		System.out.print("첫번째 계산할 값을 입력하세요==>");
		a = scan.nextFloat();
		System.out.print("두번째 계산할 값을 입력하세요==>");
		b = scan.nextFloat();
		System.out.printf("%6.2f +%6.2f = %6.2f\n", a, b, a+b);        //소수점 포함 6자리로 표현, 소수점은 두자리까지
		System.out.printf("%6.2f -%6.2f = %6.2f\n", a, b, a-b);
		System.out.printf("%6.2f *%6.2f = %6.2f\n", a, b, a*b);
		System.out.printf("%6.2f /%6.2f = %6.2f\n", a, b, a/b);
		System.out.printf("%6.2f %%%6.2f = %6.2f\n", a, b, a%b);            // 나머지 연산: %% 두개써줘야
		System.out.printf("%6.2f %%%6.2f = %d\n", a, b,(int)a% (int)b);     // int형으로 캐스팅한 결과 출력       
	}

}
