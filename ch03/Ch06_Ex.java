package ch03;

public class Ch06_Ex {

	public static void main(String[] args) {
		
	    /*
		int i,j,num = 0;
		for(i=0; i<5; i++) {
		   for(j=0; j<3; j++) {
		   System.out.printf(++num + ",");
		   }
		} 
		*/
		
		
        
		
		
        // 3의 배수나 7의 배수의 합계 구하기
		int i;
		int hap = 0;       //초기화 해주어야 함
		
		for(i=1; i<=1000; i++) {
			if((i%3==0)||(i%7==0))              //3의 배수 또는 7의 배수
				hap = hap +i;   //hap에 누적
			
		}
		System.out.printf("3의 배수 또는 7의 배수의 합: %d\n",hap);
         
	}

}
