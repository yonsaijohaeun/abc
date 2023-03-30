package TeamExam;
public class StarEx {
	public static void main(String[] args) {
		
         //다이아몬드 출력
		 //상단
		 for(int i=0; i<5; i++) {
			 for(int j=0; j<4-i; j++) {    //공백은 i행이 증가할때마다 하나씩 줄어듦
				 System.out.print(" ");
			 }
			 for(int j=0; j<1+i*2; j++) {  //*은 i행이 늘어날떄마다 2개씩 증가.
				 System.out.print("*");
			 } 
			 System.out.println(" ");
		 }
		 for(int i=0; i<4; i++ ) {
			 for(int j=0; j<i+1; j++) {   //공백은 i가 진행될때 한개씩 늘어남.
				 System.out.print(" ");
			 }
			 for(int j=0; j<7-i*2; j++) { //별은 i가 진행될떄 2개씩 줄어듦 
				 System.out.print("*");
			 }	 
			 System.out.println(" ");
		 }
		 
		

        
	}
}
