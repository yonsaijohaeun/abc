package Ex_03;
import java.util.Scanner;
public class Arr_Ex2 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);	
		int n = s.nextInt();
		int[] arr = new int [n];	
		for (int i = 0; i < arr.length; i++) {
			arr[i]= s.nextInt();
		}
		int a = s.nextInt(); // 
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]<a) {
				System.out.print(arr[i]);
			}
		}

	}

}
