package ch02;
import java.util.Scanner;        //스캐너 

public class exam {
	public static void main(String[] args) {

	   Scanner s = new Scanner(System.in);
	   String str;           //문자열 생성
	   int data;
	   System.out.printf("16 진수를 입력 : ");
	   str = s.nextLine();                    //한 줄 라인으로 입력받기
	   data = Integer.parseInt(str, 16);      // data 현재 10진수임 . 문자열을 입력받아 숫자로 출력해야 함
	   System.out.printf("입력한 16진수는 10진수로 %d입니다.", data);
	
       
	
	}
}
