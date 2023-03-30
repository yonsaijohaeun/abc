package Ch05;

public class ArrEx01 {

	public static void main(String[] args) {
		int intArray[];
        intArray = new int[10];
        for(int i=0; i<10; i++) {
        	intArray[i]=i+1;
        }
        // int[] inytArray2 = {1,2,3,4,5,6,7,8,9,10};      위와 같은 의미
        // int intArr3[10];      // 배열 선언과 동시에 크기 지정 불가. 
        /*
        int intArray [];
        intArray[1] = 8; // 오류, 생성 되지 않은 배열 사용
        */
        int[] myArr = intArray;
        Apple a1 = new Apple();
        System.out.println(a1);
        System.out.println(intArray);  //[I@3d012ddd 출력. 16진값. 
        System.out.println(myArr);
        System.out.println(intArray[1]);
        System.out.println(myArr[1]);
	}
}
class Apple {
	String name;
	int price;
	int num;
}


