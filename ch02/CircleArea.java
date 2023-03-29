/*원의 반지름을 입력받아 원의 면적 구하기*/
/* package ch02;

public class CircleArea {
	public static void main(String[] args) {
		final float PI = 3.14f;       //디폴트가 double이라 'f'를 붙여줌. 혹은 '(float)3.14;' 라고 표기
		//float PI =(float)3.14;//
	    double radius = 3.123456789123456789123456789123456789123456f;
		double area = radius * radius * PI;
		System.out.println("반지름이 " + radius+ "인 원의 면적 = " + area);
	}
}
*/

package ch02;

public class CircleArea {
	public static void main(String[] args) {
		final float PI = 3.14f;      
	    int radius     = Integer.parseInt(args[0]); 
		double area    = radius * radius * PI;             //int * float 검산 결과는 원래 float 임. 실수가 결과로 나오는 것.  
		System.out.println("반지름이 " + radius+ "인 원의 면적 = " + area);          
		byte b1 = (byte)128;        // byte 타입은 127까지 표현가능
		System.out.println(b1);     // 정수 타입에서 표현범위를 넘어가면 값이 순환됨
	}
}