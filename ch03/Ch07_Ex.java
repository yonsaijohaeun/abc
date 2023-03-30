package ch03;

public class Ch07_Ex {

	public static void main(String[] args) {
		//5번
		/*int i, k, j=0;
		i = 0;		
		while(i<3) {
			k = 0;
			while(k<4) {
				System.out.printf("중첩 while 문 %d \n", j++);
				k++;
			}
			i++;
		}*/
		
		//6번
		int i=1, hap=0;
		while(i<=100) {
			if((i%5==0)||(i%8==0))
				hap += i;
			i++;
		}	    
		System.out.printf("5의 배수 또는 8의 배수의 합: %d\n",hap);
	}

}
