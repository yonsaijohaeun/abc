package ch03;
public class StarEx2 {
	public static void main(String[] args) {
	    //*로 정삼각형 만들기(2번재 줄부터 '*'사이 공백 있게)
		
	    for(int j=1; j<6; j++) {       // j= 12345
	    	for(int k=5; k>j; k--) {
	    	    System.out.print(" ");  //* 앞에 공백 출력
	    	}
			for(int i=1; i<=j; i++) {        //* 개수 12345	   
			    System.out.print("* ");      // * 뒤에 공백 출력 
		    }
			System.out.println(); 
	    }	
	}
}
