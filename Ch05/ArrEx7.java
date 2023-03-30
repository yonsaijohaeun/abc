package Ch05;
public class ArrEx7 {
	public static void main(String[] args) {
		int[] num = {55,88,77,99};
		for(int i=0; i<num.length; i++)
			System.out.print(num[i]+", ");
		System.out.println();
		sum(num);
		reset(num);
		for(int i=0; i<num.length; i++) 
			System.out.print(num[i]+ ", ");		
	}
	public static int sum(int[] num) {
		int snum = 0;
		for(int i=0; i<num.length; i++) {
			snum += num[i];
		}
		return snum;
	}
	public static void reset(int[] num) {
		for(int i=0; i<num.length; i++) {
			num[i] = 0;
		}
	}

}
