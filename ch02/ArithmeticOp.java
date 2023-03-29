package ch02;
import java.util.Scanner;
public class ArithmeticOp {
	public static void main(String[] args) {
          Scanner scan = new Scanner(System.in);
          System.out.print("정수를 입력하세요: ");
          int time = scan.nextInt();
          int second = time % 60;               //60으로 나눈 나머지는 초
          int minute = (time / 60) % 60;        //몇 분인지 구하기. 60으로 나눠서 몇 분이고 나눈 나머지가 분 
          int hour = (time / 60) / 60;
          System.out.print(time+"초는 ");
          System.out.print(hour+"시간, ");
          System.out.print(minute+"분, ");
          System.out.println(second+"초 입니다. ");
	      scan.close();
	
	}

}
