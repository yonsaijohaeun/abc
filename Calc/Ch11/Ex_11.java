package Ch11;

//4번
/*class Car{
	private int speed;
	
	void upSpeed(int value) {
		speed += value;
	}
    public int getSpeed() {
    	return this.speed;
    }
    public void setSpeed(int value) {     //set은 리턴하지 않음.
    	this.speed += value;
    }
}
public class Ex_11 {
	public static void main(String[] args) {
		Car myCar1 = new Car();
		//myCar1.speed = 0;  // private. getspeed필요
		myCar1.getSpeed();
		myCar1.upSpeed(30); 		
	}

}*/


//7번
class Book {
	String color;
	int Book() {
		color = "빨강";
		return 0;       
	}
	public static void main(String[] args) {
		Book b1 = new Book();
		b1.color = "파랑";
		System.out.println(b1.color);
		b1.Book();
		System.out.println(b1.color);
	}
}

