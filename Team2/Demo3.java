package Team;

import java.util.Scanner;
public class Demo3 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int sum = 0;
		while(true) {  //무한으로 돌아감. 
			int num = s.nextInt();
			sum += num;
			if(sum>100){
				break;
			}
		}
		
	}
	

	
	

}
