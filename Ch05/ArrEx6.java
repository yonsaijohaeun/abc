package Ch05;

public class ArrEx6 {

	public static void main(String[] args) {
		/*int [] num = new int[5];
		int sum = 0;
		for(int i=0; i<args.length; i++) {
			num[i] = Integer.parseInt(args[i]);
			sum += num[i];
		}
        System.out.println("입력한 숫자의 합:"+sum);
        */
		
		
		//배열값들의 합
	    int[] num = {55,88,77,99};
	    System.out.println(sum(num));
	
	}
	public static int sum(int[] num) {
		int snum = 0;
		for(int i=0; i<num.length; i++) {
			snum += num[i];
		}
		return snum;
	}
	

}
