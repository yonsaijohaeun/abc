package Ch05;
public class ArrEx10 {
	public static void main(String[] args) {
		int[] intArr;
		intArr = makeArr();
		for(int i=0; i<intArr.length; i++) 
			System.out.print(intArr[i]+" ");		
	}
	public static int[] makeArr() {
		int[] temp = new int [4];
		for(int i=0; i<temp.length; i++)
			temp[i] = i+5;
		return temp;
    }
		
	

}
