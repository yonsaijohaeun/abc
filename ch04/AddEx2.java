package ch04;
public class AddEx2 {
	public static void main(String[] args) {
		AddArr2 a1 = new AddArr2();
		a1.setNum();
		for(int i=0; i<a1.num.length; i++) {
			System.out.print(a1.num[i]+", ");
		}
		System.out.println(a1.sumNum(a1.num)); //숫자들을 출력하고, 마지막에 그 숫자들의 총합 출력
		//a1.sumNum(a1.num);
	}
}
class AddArr2{
	int[] num = new int[6];
	public void setNum() {
		for(int i=0; i<num.length; i++) {
			num[i] = (int)(Math.random()*45)+1;    //1~45까지 범위
		}
	}
	public int sumNum(int[] num) {
		int sum = 0;
		for(int i=0; i<num.length; i++) {
			sum += num[i];
		}
		return sum;
	}
}

