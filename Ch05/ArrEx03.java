package Ch05;
public class ArrEx03 {
	enum Week { 월, 화, 수, 목, 금, 토, 일 };         //enum은 main 메소듣 안에 선언불가
	public static void main(String[] args) {
		
		/*for (Week day : Week.values()) // 반복될 때마다 day는 월, 화, 수, 목, 금, 토, 일로 설정 
			System.out.print(day + "요일 ");
		System.out.println();         //밑으로 한줄 내려옴
		String names[] = {"사과", "배", "바나나","체리", "딸기", "포도" };
        for(String s:names)
        	System.out.print(s+",");*/
		
		int[] n = {1,2,3,4,5};
		String names[] = {"사과", "배", "바나나","체리", "딸기", "포도" };
		
		int sum = 0;      
		for (int k:n) {                       // 반복되는 k 값 출력. for-each에서 k는 n[0], n[1], ..., n[4]로 반복
			System.out.print(k+" ");
			sum+= k;
		}
		System.out.println("합은 " + sum);     // for-each에서 s는 names[0], names[1], ..., names[5]로 반복
		for(String s :names)
			System.out.print(s + " ");
		System.out.println();
		
		for(Week day : Week.values())        // for-each에서 day는 월, 화, 수, 목, 금, 토, 일 값으로 반복 
			System.out.print(day + "요일 ");
		System.out.println();
	}

}
