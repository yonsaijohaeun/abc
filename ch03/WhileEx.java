package ch03;

import java.util.Scanner;

public class WhileEx {

	public static void main(String[] args) {
		int cnt = 0;   //count는 입력된 정수의 개수
        int sum = 0;            
        Scanner scan = new Scanner(System.in);
        System.out.println("정수를 입력하고 마지막에 -1을 입력하세요");
        int n = scan.nextInt();  //정수 입력받기
        while(n != -1) {
        	sum += n; //n을 sum에 누적
        	cnt++;
        	n = scan.nextInt();
        }        
        if(cnt==0) System.out.println("입력된 수가 없습니다.");
        else {
            System.out.print("정수의 개수는 "+cnt+"개이며 ");
            System.out.print("평균은 "+(double)sum/cnt+"입니다.");   //실수로 출력하기 위해 둘 중 하나의 변수를 double로 캐스팅
        }
        scan.close();
	}

}
