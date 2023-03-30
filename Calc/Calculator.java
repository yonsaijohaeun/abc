//다음 추상 클래스 Calculator를 상속받은 GoodCalc 클래스를 구현하라.

package Calc;
abstract class Calculator {    //abstract 체크하고 생성
    public abstract int add(int a, int b);
    public abstract int sub(int a, int b);   //빼기
    public abstract double average(int[] a);    
}

class GoodCalc extends Calculator{      // GoodCalc에 빨간밑줄-> add ~ 클릭	
	public int add(int a, int b) {
		return a + b;
	}	
	public int sub(int a, int b) {
		return a - b;
	}	
	public double average(int[] a) {
		double avg = 0, sum = 0;
		for(int i=0; i<a.length; i++) {
			sum += a[i];   //누적
		}
		return avg = sum/a.length;
	}
    public static void main(String[] args) {
    	GoodCalc g1 = new GoodCalc();
    	System.out.println(g1.add(5, 8));
    	System.out.println(g1.sub(5, 8));
    	System.out.println(g1.average(new int[] {1,2,3,4,5}));
    	
    }	
}

