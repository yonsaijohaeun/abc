package TeamExam;
import java.util.Scanner;
public class Exam1 {
   public static void main(String[] args) {
      
      //#1
      //태국에서는 기년법으로 불기를 쓴다고 합니다. 서기 2022년은 불기 2566년이라고 합니다.
      //서기를 입력했을 때 불기로 바꿔서 출력해주는 프로그램을 만들어주세요.
      
      
     /* Scanner s = new Scanner(System.in);
      int year, byear;
      System.out.print("서기를 입력하세요: ");
      year = s.nextInt();
      byear = year + 544;
      System.out.print("입력한 연도는 불기로 " +byear+"년 입니다.");
      */
	   
	   
//    #2
//    양의 정수 n을 입력 받습니다. 입력 받은 n의 팩토리얼(n!)의 결과를 출력해주는 프로그램을
//    만들어주세요
  
	  /*Scanner s = new Scanner(System.in);
	  System.out.print("양의 정수를 입력하세요: ");
      int n = s.nextInt();
      int fac = 1;
      for(int i=n; i>0; i--) {
    	  fac = fac * i; 
      }
	  System.out.println(n+"! = "+ fac);
	  */
	   
//	  #3
//	  for문을 이용해서 알파벳 a부터 z까지, A부터 Z까지 출력하는 프로그램을 만들어주세요 
	   
	   
	  /*for(char i='a'; i<'z'; i++) {
		  System.out.print(i+" ");  
	  }
	  System.out.println();
	  for(char i='A'; i<'Z'; i++) {
		  System.out.print(i+" ");  
	  }
	  */
	   
//	  #4
//	  3 6 9 게임입니다. 100이하의 수 중에서 3 6 9가 포함된 수를 제외하고 출력하는 프로그램을
//	  만들어주세요.
	  
	  //미완
	  /*for(int i=1; i<100; i++) {
			 System.out.print(i+"\t"); 
	  }
	  */
	   
//	  #5
//	  시험 점수 n을 입력 받아
//	  90 ~ 100점은 A,
//	  80 ~ 89점은 B,
//	  70 ~ 79점은 C,
//	  60 ~ 69점은 D,
//	  나머지 점수는 F를 출력하는 프로그램을 만들어주세요.
	  
	  /*char grade;
		Scanner scanner = new Scanner(System.in);
		System.out.print("점수를 입력하세요(0~100): ");
		int n = scanner.nextInt(); // 점수 읽기
		if(n >= 90) // n 90 이상
			grade = 'A';
		else if(n >= 80) // n 80 이상 90 미만
			grade = 'B';
		else if(n >= 70) // n 70 이상 80 미만
			grade = 'C';
		else if(n >= 60) // n 60 이상 70 미만
			grade = 'D';
		else // n 60 이만
			grade = 'F';
		System.out.println("학점은 "+ grade + "입니다.");
		
		scanner.close();
	  */
	   
//	  #6
//	  세 정수를 입력 받아서 실수형태의 평균을 출력해주는 프로그램을 만들어주세요
	  
	  int a,b,c;
	  double hap;
	  
	  Scanner s = new Scanner(System.in);
	  System.out.println("정수 세 개를 입력하세요: ");
	  a = s.nextInt(); 
	  b = s.nextInt(); 
	  c = s.nextInt(); 
	  hap = a+b+c;
	  System.out.println("입력한 정수의 평균은 "+hap/3+" 입니다.");
	 
	   

   }
}   

      
      
