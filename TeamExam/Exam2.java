package TeamExam;
import java.util.Scanner;

public class Exam2 {

	public static void main(String[] args) {
//		#8 
//		세자릿수 곱셈. 첫째줄부터 각각 A B C D를 출력해 주는 프로그램을 만들어 주세요
		
		/*Scanner s = new Scanner(System.in);
		System.out.print("첫번째 숫자 입력: ");
		int n1 = s.nextInt();
		System.out.print("두번째 숫자 입력: ");
		int n2 = s.nextInt();
		int result = n1*n2;
		
		for(int i=0; i<(int)(Math.log10(n2)+1);i++){
			int temp = n2 % 10;
			n2 /= 10;
			System.out.println(temp*n1);
		}
		System.out.println(n2*n1);
		System.out.println(result);
		*/
//		
//		#10
//		1에서부터 6까지의 눈을 가진 3개의 주사위를 던져서 다음과 같은 규칙에 따라 상금을 받는 게임이
//		있습니다.
//		상금 규칙은 다음과 같습니다.
//		같은 눈이 3개가 나오면 10,000원+(같은 눈)×1,000원의 상금을 받게 된다.
//		같은 눈이 2개만 나오는 경우에는 1,000원+(같은 눈)×100원의 상금을 받게 된다.
//		모두 다른 눈이 나오는 경우에는 (그 중 가장 큰 눈)×100원의 상금을 받게 된다.
//		1 ~ 6 사이의 정수 3개를 입력했을 때 받게 될 상금을 알려주는 프로그램을 만들어주세요
		
		/*Scanner s = new Scanner(System.in);
		System.out.println("1~6 사이의 정수 3개를 입력하세요: ");
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		
	    //모두 다른 눈이 나온는 경우
		if(a != b && b !=c && a != c) {
			int max;
			if(a>b) {  //a>b라면
				if(c>a) { //c>a>b라면
					max = c;
				}
				else
					max = a;
			}
			//b>a 라면
			else {
				if(c>b) {
					max = c;
				}
				// b>(a,c)
				else {
					max = b;
				}
			}
			System.out.println(max*100);
		}
		//적어도 한 쌍 이상 서로 같은 눈이 존재할 경우
		else {
			// 3개의 변수가 모두 같은 경우
			if( a == b && a == c ) {
				System.out.println(10000+ a* 1000);
			}
			else {
				//a가 b or c랑만 같은 경우
				if( a == b || a == c) {
					System.out.println(1000+ a*100);
				}
				// b,c가 같은 경우
				else 
					System.out.println(1000+ b*100);
			}
		}*/
		
//		#11
//		우선 시간을 입력 받습니다. 처음에 입력 받은 수 h는 시간, 두번째 입력 받은 수 m은 분이 됩니다.
//		마지막으로 3번째에 입력 받은 수n을 분으로 취급해서 h시 m분에서 n분 후의 시간을 출력하는
//		프로그램을 만들어주세요
		
		//미완 
		Scanner s = new Scanner(System.in);
		System.out.println("시간을 입력하세요 :");		
		int h = s.nextInt();
		int m = s.nextInt();
		int n = s.nextInt();
		int result;
		
		
		System.out.println(h +"시 "+ m+"분에서 "+n+"분을 더한 시간");
		System.out.println(result);
		
		
		
		
		
		
    }

}
