import java.util.Scanner;

public class Receipt {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();  //총 금액
		int n = s.nextInt();  //구매한 물건 개수
		
		for(int i=0; i<n; i++) {
			int price = s.nextInt();
			int number = s.nextInt();
			x = x-(price*number);
		}
		
		if(x==0) 
			System.out.println("Yes");	
		
		else
			System.out.println("No");
	}

}
