package Demo;

public class Child extends Person{
	private int price = 3000;

	@Override
	public int getprice() {
		
		return this.price;   //price는 메소드가 아니여서 ()필요없으
	} 
	

}
