package ch02;
import java.util.Scanner;
public class Ex04_9 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        int money, c500, c100, c50, c10;
        System.out.print("## 교환할 돈은 ? ");
        money = scan.nextInt();
        c500 = money / 500;
        money = money % 500;
        //c100 = (money-money*c500)/100;      너무 길어진다. 
        c100 = money / 100;
        money = money % 100;
        c50 = money / 50;
        money = money % 50;
        c10 = money / 10;
        money = money % 10;
        System.out.printf("\n오백원짜리 ==> %d 개 \n", c500);
        System.out.printf(" 백원짜리 ==> %d 개 \n", c100);
        System.out.printf(" 오십원짜리 ==> %d 개 \n", c50);
        System.out.printf(" 십원짜리 ==> %d 개 \n", c10);
        System.out.printf(" 바꾸지못한 돈 ==> %d 원 \n", money);
         
        
	}

}
