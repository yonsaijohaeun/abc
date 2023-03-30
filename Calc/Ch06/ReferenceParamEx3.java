package Ch06;
public class ReferenceParamEx3 {
	public static void main(String[] args) {
		int[] arr = new int[] {8,7,1,5,6,4};
		//System.out.println(sumArr(arr));  배열의 숫자 합 출력
 		printArr(arr);
		sortArr(arr);
		printArr(arr);
		//arr[0]=3 arr[1]=2   tmp
		//tmp=arr[0]
		//arr[0]= arr[1]
		//arr[1]=tmp
    }
	static int sumArr(int[] arr) {
		int result = 0;
		for(int i=0; i<arr.length; i++ ) {
			result += arr[i];
		}
		return result;
	}
	static void printArr(int[] arr) {
		System.out.print("[");
		for(int i : arr) {
		  System.out.print(i+",");	
		  
		}
		System.out.println("]");
	}
	static void sortArr(int[] arr) {
		for(int i=0; i<arr.length-1; i++) {
			for(int j=0; j<arr.length-1-i; j++) {
				int tmp = 0;
				if(arr[j]>arr[j+1]) {
					tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
				}
			}
		    printArr(arr);
		}
	}
}
