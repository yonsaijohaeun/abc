package Ch05;

import java.util.Scanner;

public class ArrEx02 {

	public static void main(String[] args) {
		
		//배열에 입력받은 수 중 제일큰수 찾기
		/* Scanner s = new Scanner(System.in);
		int intArr[] = new int[5];          //5개 크기의 배열 생성
		int max = 0;                        //현재 가장 큰 수
		System.out.println(intArr.length);  //배열의 크기를 알려줌
		System.out.println("양수 5개를 입력하세요");  //입력받은 정수를 배열에 저장
		for(int i=0; i<5; i++) {                  
			intArr[i] = s.nextInt();        
			if(intArr[i] > max) {           //intArr[i]가 현재 가장 큰 수보다 크면
				max = intArr[i];            //intArr[i]를 max로 변경
			}
			
		}
		
        System.out.println("가장 큰 수는 "+max+"입니다.");
        s.close(); */
		
		
		//배열 원소의 평균 구하기
		Scanner s = new Scanner(System.in);
		int intArr[]= new int[5];
		int max = 0, sum = 0;
		System.out.println(intArr.length);
		System.out.println("양수 5개를 입력하세요"); 
		for(int i=0; i<intArr.length; i++) {
			intArr[i] = s.nextInt(); 
			sum += intArr[i];
		}
		
		System.out.println("평균은 "+ (double)sum/intArr.length);
		s.close();
	
	}

}
