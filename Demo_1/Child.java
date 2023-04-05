package Demo_1;

public class Child extends Person{
	static int count = 0;
	public Child() {
		count++;
	}
	private int price = 3000;

	@Override
	public int getprice() {
		
		return this.price;   //price는 메소드가 아니여서 ()필요없으
	} 
	

}
