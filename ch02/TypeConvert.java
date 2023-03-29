package ch02;

public class TypeConvert {

	public static void main(String[] args) {
		int  n   = 300;
		byte b1  = (byte)n;
		byte b2  = 127;
		int  i   = 100;
	    System.out.println(b1);
	    System.out.println(b2+i);
	    System.out.println(10/4);         // 10도 4도 int 이기 때문에 결과도 int인 2. (소수점 제외됨)
	    System.out.println(10.0/4);       //10.0 은 double 이기에 결과도 double
	    System.out.println(0123);         // 83출력이유: '0'으로 시작하면 8진으로 알아듣고 8진법으로 계산함
	    System.out.println(0x123);        //'0x'로 시작하면 16진법 (0*16^3+1*16^2..=291)
	    System.out.println(101100);
	    System.out.println(0b1011);        //0b숫자 -->2진법으로 계산됨 
	    System.out.println((byte)(b2+i));  // 
	    System.out.println((char)0x12340041);    // 16진 8자리 유니코드로 41번째 문자가 'A'. char로 캐스팅 . int 타입 4바이트라 0041.
	    System.out.println((char)0x0041);       //앞에 4자리('1234') 잘려서 전과 같은 결과 출력 
	    System.out.println(2.9+1.8);           //4.7 출력
	    System.out.println((int)2.9+1.8);      //int + double = double. 2.9에서 0.9 잘림. 2+1.8
	    System.out.println((int)2.9+(int)1.8);  // 정수형 캐스팅. 2+1=3
	    System.out.println((int)(2.9+1.8));     //4.7에서 캐스팅해서 '4'출력 
	    
	    
	    
	    
	}

}
