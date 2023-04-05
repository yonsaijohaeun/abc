package Demo_1;

public class Teen extends Person {
	static int count = 0;
	public Teen() {
		count++;
	}
	private int price = 7000;

	@Override
	public int getprice() {
		return this.price;
	}

}
