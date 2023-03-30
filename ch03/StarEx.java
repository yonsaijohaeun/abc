package ch03;
public class StarEx {
	public static void main(String[] args) {
	    //직삼각형 만들기  
		/* for(int j=0; j<5; j++) {
		   for(int i=0; i<=j; i++) {         //
		       System.out.print("*");
	       }
		   System.out.println(); 
	    } */
	    
	    
	    //*로 정삼각형 만들기('*'사이 공백 없이)
	    for(int j=1; j<6; j++) {       // j= 12345
	    	for(int k=5; k>j; k--) {
	    	    System.out.print(" ");  //공백 출력
	    	}
			for(int i=1; i<=j*2-1; i++) {        //13579로 만들기				   
			    System.out.print("*");
		    }
			System.out.println(); 
	    }	
	}
}
