package Ch05;
import java.util.Scanner;
public class Ch08_Ex {

	public static void main(String[] args) {
		
		//6번문제
		/*Scanner s = new Scanner(System.in);
		double [] dd = new double[4];
		int i = 0;
		double sum = 0.0, mul = 1.0;          //sum, mul 변수는 while 문 밖에서 선언해야 한다. mul은 곱셈이기에 1.0으로 초기화
		while(i<4) {
			System.out.print(i+1+"번째 숫자를 입력하세요 : ");
			dd[i] = s.nextDouble();
			sum += dd[i];   //누적
			mul *= dd[i];
			i++;
 		}
		System.out.println("합계 ==> " + sum);
		System.out.println("곱셈 ==> " + mul);
		*/
		
		//7번문제
		/*int[] cc = {100, 200, 300,400,500};
		int len;
		len = cc.length * Integer.BYTES;
		
		System.out.printf("배열 cc[]가 차지하는 메모리 공간은 %d 입니다.\n",len);
		*/
		
		//8번 문제
		//for문
		/*int aa[][] = new int[3][4];
		int i,k;
		int val = 1;
		for(i=0; i<3; i++) {
			for(k=0; k<4; k++) {
				aa[i][k] = val;
				val++;
				System.out.print(aa[i][k]+" ");
			}
			System.out.println();
		}
		*/
		
		//while문 
		/*int aa[][] = new int[3][4];
		int i=0, k;
		int val = 1;
		while(i<3) {
			k = 0; 
			while(k<4) {
				aa[i][k] = val;
				val++;
				System.out.print(aa[i][k]+" ");
				k++;
			}
			System.out.println();
			i++;
		}*/
		
		
		//9번문제
		char car = 'A';
		char[] garage2 = new char[5];
		int rear = 0;
		Scanner s = new Scanner(System.in);
		System.out.println("메뉴를 선택하세요");
		int menu = 0;		
	    while(menu != 3) {
	    	System.out.println("<1> 자동차 넣기 <2> 자동차 빼기 <3> 끝내기 : ");
	    	menu = s.nextInt();		
	    	switch(menu) {
	    	case 1:
	    		if(rear<5) {
					garage2[rear] = car;
					//System.out.println((garage2)[rear]+"가 창고에 들어감.");
					car++;
					rear++;
				}else
					System.out.println("더이상 대여할 공간이 없습니다.");
	    		System.out.print("현재 자동차==> ");
	    		for(int k=0; k<5; k++)
	    			System.out.print(garage2[k]+" ");
	    		System.out.println();
	    		break;
	    	case 2:	
		   	   if(rear>0) {
				    //System.out.println(garage2[0]+"가 창고에서 나감.");
				    for(int j=0; j<4; j++) {
				        garage2[j] = garage2[j+1];
			        }
				    rear--;
			   }else
				  System.out.println("더이상 반납할 차량이 없습니다.");
		   	   System.out.print("현재 자동차==> ");
    		   for(int k=0; k<5; k++)
    			   System.out.print(garage2[k]+" ");
    		   System.out.println();
    		   break;
	    	}
	    }
	    System.out.println("프로그램을 종료합니다.");
	}
		
}
