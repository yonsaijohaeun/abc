package Ch09;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		
		//2번문제
		Scanner s = new Scanner(System.in);
		String ss1, ss2, ss3;
		int r1, r2;
		
		System.out.print("문자열 1을 입력:");
		ss1 = s.nextLine();
		System.out.print("문자열 2를 입력:");
		ss2 = s.nextLine();

		ss3 = ss1+ss2;
		System.out.printf("합쳐진 문자열 ==> %s \n",ss3);
		
		r1 = ss1.length();
		r2 = ss2.length();
		
		System.out.printf("문자열 1 길이 ==> %d \n",r1);
		System.out.printf("문자열 2 길이 ==> %d \n",r2);
		
		if(ss1.compareTo(ss2)==0) 
			System.out.printf("두 문자열은 같다.\n");
		else
			System.out.printf("두 문자열은 다르다.\n");
	}

}
