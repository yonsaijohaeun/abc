package Team;

public class Jajung_4_9 {
	public static void main(String[] args) {
		String str = "12345";
		int sum = 0;
		
		for(int i=0; i<str.length(); i++) {
			sum += str.charAt(i)-'0';  // 아스키코드 값이 있어서 캐릭터 타입의 0을 빼주어야 함. 
			
		}
		
		System.out.println("sum="+sum);

	}

}
