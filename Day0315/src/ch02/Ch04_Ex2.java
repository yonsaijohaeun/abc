package ch02;
import java.util.Scanner;
public class Ch04_Ex2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        int time, hour, min, sec;
        System.out.print("## 계산할 초는 ? ");
        time = scan.nextInt();
        
		sec = time % 60; 				// 60으로 나눈 나머지는 초
		min = (time / 60) % 60; 	// 60으로 나눈 몫을 다시 60으로 나눈 나머지는 분
		hour = (time / 60) / 60; 		// 60으로 나눈 몫을 다시 60으로 나눈 몫은 시간
		

        System.out.printf("\n시간은 ==> %d 시간\n", hour);
        System.out.printf(" 분은 ==> %d 분 \n", min);
        System.out.printf(" 초는 ==> %d 초\n", sec);
      
        scan.close();
	}

}
