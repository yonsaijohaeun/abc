package Ex_03;

import java.util.Iterator;
import java.util.Scanner;

public class Arr_Ex {
	public static void main(String[] args) {
		
    //n개의 정수가 주어졌을 때 정수 v는 몇개인가? 
	Scanner s = new Scanner(System.in);	
	int n = s.nextInt();
	int[] arr = new int [n];         //n개의 배열 생성
	
	for (int j = 0; j < arr.length; j++) {   //배열 n개만큼의 입력할 숫자 출력
		arr[j] = s.nextInt(); 
	}
	int a = s.nextInt();        //찾을 숫자 입력
	int count = 0;      
	for (int j = 0; j < arr.length; j++) {       //입력한 배열 숫자들 중에서 a와 같은숫자 count
		if(arr[j] == a) {
			count++;
		}
	}
	System.out.println(count);            //count 출력

		
		
	}
    
}
