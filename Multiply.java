package Exam2;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Multiply {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(true) {
			try {
				System.out.print("곱하고자 하는 두 수 입력>>");
				int n = scanner.nextInt();
				int m = scanner.nextInt();
				System.out.println(n+"x"+m+"="+n*m);
				break;
			}
			catch(InputMismatchException e) {
				scanner = new Scanner(System.in);
				System.out.println("실수는 입력하면 안됩니다.");
			}
		}
		scanner.close();
	}

}
