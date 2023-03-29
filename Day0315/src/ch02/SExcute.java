package ch02;

public class SExcute {
	public static void main(String[] args) {
		String toolName = "JDK";
		System.out.println(toolName + "1.8이 출시되었습니다.");   //변수 + 문자열. 앞에있는게 string 이면 뒤도 string 된다. 
		int a = 15;
		System.out.println(a+ "years old");    // 숫자 15와 문자열이 문자열로 출력됨 
		toolName = toolName + "1.8";
		System.out.println(toolName);
		System.out.println("("+ 3+ "," + 5+")");           // 문자열 연산 지원 
	    //int price = 3.5;    // int 정수형은 실수값 출력안됨
	    int price2 = 3;       // 3 출력함 
        // ==                 //    같은지 아닌지 비교해줌 
        //int price = 0b123456;   //0b는 이진수만 가능 
        long num = 0b10110L;    
        char a1 = 'A';
        char b = '글';
        char c = '\u0041'; // 문자 'A'의 유니코드 값(0041) 사용
        char d = '\uae00'; // 문자 '글'의 유니코드 값(ae00) 사용
        System.out.println(a1);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        
        
        
        
	}
}
