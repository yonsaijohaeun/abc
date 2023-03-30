package Ch02;

import java.util.Scanner;

public class Sol02_02 {
	public static void main (String[] args) {
		// 정수의 제곱 구하기
		/*Scanner s = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int num = s.nextInt();
		System.out.println(num + "의 제곱은 " + num*num);
       */
	
		//원기둥의 부피 구하기
		/*Scanner s = new Scanner(System.in);
		final double PI = 3.14;
		System.out.print("원기둥의 밑면 반지름은? ");
        double r = s.nextDouble();
        System.out.print("원기둥의 높이는? ");
		double h = s.nextDouble();
		double d = PI * r * r * h;
	    System.out.println("원기둥의 부피는? " + d);
		/*	
				
	 
		//초를 입력받아 시간 환산하여 출력하기
		/*Scanner scan = new Scanner(System.in);		
		int h, m, s;
		System.out.print("초단위 정수를 입력하세요 : ");
		int time = scan.nextInt();
		s = time % 60;
		m = (time/60) % 60;
		h = (time/60)/60;
		System.out.println(h + "시간 " + m + "분 " + s + "초");
		*/		
        
		//화씨 입력하여 섭씨 출력
		/*Scanner scan = new Scanner(System.in);
		System.out.print("화씨온도를 입력해주세요:");
		double f = scan.nextDouble();
		double c = (5.0/9)*(f - 32);           //5.0 또는 9.0을 해야 됨 
		System.out.println("섭씨 온도는 : "+ c);
		*/
		
		
		
		
		//1)4,5로 나눠 떨어지는지 (&&)
	    //2)4또는5로 나누어지는지  (||)
		//3)4또는 5로는 나누어지지만 두 수 모두로는 안나눠지는. 2) - 1)하라.			
		/*Scanner scan = new Scanner(System.in);
		System.out.print("정수를 입력해주세요:");
		double num = scan.nextInt();
		boolean and, or, test;
		and = (num%4==0)&&(num%5==0);
		or = (num%4==0)||(num%5==0);
		test = or && !and;
		
		System.out.println("(1)4와 5로 나누어 떨어지는 경우"+ and );
		System.out.println("(2)4 또는 5로 나누어 떨어지는 경우" + or);
		System.out.println("(3)4또는 5로 나누어 떨어지면서 4와 5로 나누어 떨어지지 않는 경우"+ test);   
	    */
		
		// 정수를 입력받아 각 자릿수를 더한 결과 출력하기 
		/*Scanner scan = new Scanner(System.in);
		System.out.print("0~999사이의 숫자를 입력하세요 :");
		int num = scan.nextInt();
		int sum = 0;   
		sum = num % 10;    //1의 자리
		num /= 10;   
		sum += num % 10;   //10의 자리
		num /= 10;         //100의 자리
		sum += num;          
		
		System.out.println("각 자릿수의 합 = "+sum);
		*/
		
		
		// 학점을 입력받아 졸업 여부를 출력하기 (140점 이수해야함, 전공:70, 교양:30 일반:30. 총점은 80학점 이상 )
		
		Scanner scan = new Scanner(System.in);
		int a, b, c;     //a: 전공, b: 교양 , c: 일반
		System.out.print("전공 이수 학점 : ");
		a = scan.nextInt();
		System.out.print("교양 이수 학점 : ");
		b = scan.nextInt();
		System.out.print("일반 이수 학점 : ");
		c = scan.nextInt(); 
		// ((a+b+c)>=140) && (a>=70)&& 
		//((b>=30 && c>=30)||((b+c>=80)) : b,c가 각각 30보다 크거나 b+c의 총점이 80 이상 
		boolean b1 = (((a+b+c)>=140)&& a>=70)&& 
                     ((b>=30 && c>=30)||((b+c)>=80));
		System.out.println(b1?"졸업 가능":"졸업 불가능");
	}
	

}








