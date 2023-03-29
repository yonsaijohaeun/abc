package ch02;

import java.util.Scanner;
public class ScanneerEx {

	public static void main(String[] args) {
		/* java.util.Scanner scan = 
				new java.util.Scanner(System.in); */
		
		/*System.out.println("이름과 나이, 키, 연체여부를 입력하세요.");
		Scanner scan = new Scanner(System.in);      // ctrl+ shift+o 누르기          
	    String name = scan.next();            //scan.next()로 리턴되는 값이 문자열이다
	    System.out.println("이름 : " + name);
	    int age = scan.nextInt();             // 나이는 정수이기 때문에 int로 지정
	    System.out.println("나이 : " + age);     
	    double height = scan.nextDouble();             // 키는 실수이기 때문에 double로 지정
	    System.out.println("키 : " + height);   
	    boolean credit = scan.nextBoolean();             // 연체여부이기 때문에 boolean로 지정
	    System.out.println("연체여부 : " + credit); 
	    scan.close();         // scan은 close를 해주는게 좋다
	    */
	    
	    
		System.out.println("이름과 나이, 키, 연체여부를 입력하세요.");
		Scanner scan = new Scanner(System.in);      // ctrl+ shift+o 누르기          
	    String name = scan.next();            //scan.next()로 리턴되는 값이 문자열이다
	    System.out.println("이름 : " + name);
	    int age = scan.nextInt();             // 나이는 정수이기 때문에 int로 지정
	    System.out.println("나이 : " + age);     
	    double height = scan.nextDouble();             // 키는 실수이기 때문에 double로 지정
	    System.out.println("키 : " + height);   
	    boolean credit = scan.nextBoolean();             // 연체여부이기 때문에 boolean로 지정
	    System.out.println("연체여부 : " + credit); 
	    scan.close();         // scan은 close를 해주는게 좋다
	    
	    
	}

}
