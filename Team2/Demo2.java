package Team;

import java.util.Scanner;

public class Demo2 {
	public static int inputNumber() {
		System.out.println("0에서 100사이의 값을 입력하세요: ");
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		
		return num;
	}
	
	public static void calcOperation(int x, int y, String s) {
		switch(s) {
		case "+": 
			System.out.println(x+y);
		}
		switch(s) {
		case "-": 
			System.out.println(x-y);
		}
		switch(s) {
		case "*": 
			System.out.println(x*y);
		}
		switch(s) {
		case "/": 
			System.out.println(x/y);
		}
	}
	
	public static void fourCalc(int x, int y) {
		calcOperation(x,y,"+");
		calcOperation(x,y,"-");
		calcOperation(x,y,"*");
		calcOperation(x,y,"/");
		
	}
	public static void main(String[] args) {
		int x = inputNumber();  //inputNumber 메소드를 통해 값 입력받음
		int y = inputNumber();
		fourCalc(x,y);  //fourCalc 메소드를 통해 calcOperation 메소드 수행 
	
	}
	
  }

