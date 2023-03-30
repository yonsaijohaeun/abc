package Ch05;
public class ArrEx5 {
	public static void main(String[] args) { 
		
		/*int [][] intArr= new int [4][];
		
		intArr[0] = new int[3];
		intArr[1] = new int[2];
		intArr[2] = new int[3];
		intArr[3] = new int[2];
		
		for(int i=0; i<intArr.length; i++) {
			for(int j=0; j<intArr[i].length; j++) {
				intArr[i][j] = (i+1)*10+j;
			}	    
		}	
		for(int i=0; i<intArr.length; i++) {
			for(int j=0; j<intArr[i].length; j++) {
				System.out.print(intArr[i][j]+" ");
			}	    
			System.out.println();
	    }*/
		
		
	    int [][] intArr= new int [5][5];
        int num = 0;
		for(int i=0; i<intArr.length; i++) {
			for(int j=0; j<intArr[i].length; j++) {
				intArr[i][j] = ++num;               // ++num: 대입되면서 증가
			}	    
		}	
		for(int i=0; i<intArr.length; i++) {
			for(int j=0; j<intArr[i].length; j++) {
				System.out.print(intArr[i][j]+" ");
			}	    
			System.out.println();
	    }
		
		
		
	}
}
