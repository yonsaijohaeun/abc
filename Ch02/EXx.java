package Ch02;

import java.util.Scanner;

public class EXx {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a;
		System.out.print("처리할 수를 입력하세요 : ");
	    a = s.nextInt();
	    if(a>0) 
	    	System.out.println("입력한 수는 + 입니다.");
	    
	    else if(a<0) 
	    	System.out.println("입력한 수는 - 입니다.");
	    else 
	    	System.out.println("입력한 수는 0 입니다.");
	   
	}

}
