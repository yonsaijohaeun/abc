//윤년 계산 프로그램
package ch02;
import java.util.Scanner;
public class Ex04_10 {

	public static void main(String[] args) {
	  Scanner scan = new Scanner(System.in);               //윤년인지 아닌지 판단. 4로 나눴을때 나머지가 0-> 4의 배수
	  System.out.print("연도를 입력하세요 :");
	  int year = scan.nextInt();
	  boolean leap = false;
	  //조건: 윤년 4의 배수 o, 100의 배수 x, 400의 배수o 가 다 만족해야 함. 
	  leap = (year%4 == 0)&&(year%100 != 0)||(year %400 == 0);        //윤년은 4로 나눴을 때 나머지가 0이면서 100의 배수가 아니여야 되고 400의 배수여야함 
	  if(leap == true) {
		  System.out.printf("%d년은 윤년입니다.", year);
	  }
	  else
		  System.out.printf("%d년은 윤년이 아닙니다.", year);            //else가 한 문장이면 {} 밖에 쓸 수 있다 
	  scan.close();
	  
	}

}
