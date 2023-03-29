package ch02;

public class BoolLiteral {
   public static void main(String[] args) {
	   boolean a = true;
	   boolean b =10 > 0;
	   // boolean c = 1;       논리값은 숫자로 쓸 수 없다. 타입불일치 오류
	   // int n = null;       null타입은 int로 형변환 될 수 없다. 객체가 초기화되지 않았을때 사용
       String str = null;     //레퍼런스에 대입 사용
       String str2 = new String("홍길동");
       String str3 = "홍길동";
       String str4 = "홍길동";               // str4=str3
       String str5 = str2;
       
       System.out.println(str2 == str3);            //str2 과 str3이 다른 값을 가리키기에(다른 주소값) false 출력
       System.out.println(str3 == str4);            // str3과 str4가 같은 문자열이기에 true 출력     
       System.out.println(str2 == str5);            
       System.out.println(str2.equals(str3));      // equals 메소드를 사용하여 둘의 값이 같은지 비교. true 출력 
       
       
       //final double PI;
       //PI = 3.14;               선언시 나눠서 써도 되지만 선언과 동시에 초기값 지정 권장 
       
   }
}
