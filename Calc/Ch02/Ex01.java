package Ch02;

public class Ex01 {

	public static void main(String[] args) {
		/*System.out.printf("100+100");  //100+100 출력 
		System.out.printf("\n");   //행 넘어감
		System.out.printf("%d",100+100); //200 출력
		System.out.printf("\n");  //행 넘어감
		*/
		
		/*System.out.printf("%d %d",100,200);
		System.out.printf("\n");
		System.out.printf("%d",100 );
		System.out.printf("\n");
		*/
		
		/*System.out.printf("%d+%d=%d \n",100,200,100+200);
		System.out.printf("%d/%d=%f \n",100,200,0.5);
		System.out.printf("%c %c \n", 'a','k');
		System.out.printf("%s %s \n", "IT COOKBOOK", "JAVA");
		*/
		
		//서식 활용
	    /*System.out.printf("\n줄바꿈\n연습 \n");
	    System.out.printf("\t탭키\t연습 \n");
	    System.out.printf("이것을 \r덮어씁니다 \n");
	    System.out.printf("글자가 \"강조\"되는 효과 \n");
	    System.out.printf("\\\\\\ 역슬래시 세 개 출력 \n");
        */
		
		//변수에 변수를 대입
		/*int a,b;
		float c,d;
		
		a=100;
		b=a;
		
		c=111.1f;
		d=c;
		
		System.out.printf("a,b의 값==> %d, %d\n", a,b);   //100,100
		System.out.printf("c,d의 값==> %5.1f, %5.1f\n", c,d);   //111.1f, 111.1f
		*/
		
		int a,b,c,d;
		a = 100+100;  //200
		b = a+100;    //200+100=300
		c = a+b-100;  //200+300-100= 400
		d = a+b+c;    //200+300+400 : 900
		System.out.printf("a,b,c,d의 값==>%d, %d, %d, %d \n",a,b,c,d);
		
		a=b=c=d=100;  //a,b,c,d에 모두 100을 대입
	    System.out.printf("a,b,c,d의 값 ==> %d, %d, %d, %d \n",a,b,c,d);
		
	    a = 100;
	    a = a+200;
	    System.out.printf("a의 값==> %d\n", a); 
	
		
		
		
		
	}

}
