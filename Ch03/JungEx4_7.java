package Ch03;

public class JungEx4_7 {

	public static void main(String[] args) {
		
		//7번 문제
		/*int value = (int)(Math.random()*6)+1;              //class 이름.radom 메소드
		System.out.println("value:"+value);
        */
		
		
		//13번 문제. charAt 메소드. 캐릭터 당 번호는 0번부터 시작 
		/*String value = "12o34";                 //5자리 인덱스(0~4)
		char ch = ' ';
		boolean isNum = true;
		int i;
		for(i=0; i<value.length(); i++)  {   //legth : string에서 제공해주는 메소드. 0~4인덱스
			ch = value.charAt(i);      
			if(!(('0'<=ch)&&(ch<='9'))) {
				isNum = false;			
				break;                          //문자를 만나면 break
			}
		}	
		if(isNum) {
			System.out.println(value +"는 숫자입니다."); 			
		}else {
			ch = value.charAt(i);
			System.out.println(ch +"는 숫자가 아닙니다.");
		}*/
		
		
		
		//14번 문제
		int answer = (int)(Math.random()*100)+1; // 1~100사이의 값
		int input = 0;     // 사용자가 입력하는 숫자
		int count = 0;     // 시도 횟수
		java.util.Scanner s = new java.util.Scanner(System.in);
		do {
			count++;
			System.out.println("1과 100사이의 값을 입력하세요 : ");
			input = s.nextInt();
			if(answer>input) {
				System.out.println("더 큰 수를 입력하세요.");
			}else if(answer<input) {
				System.out.println("더 작은 수를 입력하세요");
			}else {
			  System.out.println("맞췄습니다.");
			  System.out.println("시도 횟수는 " + count +"번입니다.");
			  break;          //맞추면 반복문 탈출. 
		    }
		}while(true);
	}

}
