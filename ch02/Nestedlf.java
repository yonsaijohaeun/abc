package ch02;

import java.util.Scanner;
//60점 이상이면 합격. 4학년은 70점 이상이어야 합격하는 프로그램

public class Nestedlf {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);         // scanner 객체 생성 
		
		System.out.printf("점수를 입력하세요(0~100): ");
		int score = scanner.nextInt();                    // score 변수를 정수형으로 입력받음
		
		System.out.printf("학년을 입력하세요(1~4): ");
		int year = scanner.nextInt();                     // year 변수를 정수형으로 입력받음
		
		if(score >= 60) {    //60점 이상
			if(year != 4)
				System.out.println("합격!");   //4학년 아니면 합격
			else if(score >=70)
				System.out.println("합격!");   //4학년이 70점 이상이면 합격
			else
				System.out.println("불합격!");  //4학년이 70점 미만이면 합격					
		}
		else     //60점 미만 불합격
			System.out.println("불합격!");
		scanner.close();

	}

}
