package Ch05;

public class MethodOverload {

	public static void main(String[] args) {
	
	}

	public float getSum(int i, float j) {
		return i + j;
		
	}
	public double getSum(float i, int j) {
		return (double)(i + j);
	}
	
}
