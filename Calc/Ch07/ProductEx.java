package Ch07;

class Product {
	int price;
	public Product(int price) {
		this.price = price;
		this.bonusPoint = (int)(price*0.1);
	}
	int bonusPoint;
}
class Tv extends Product {	
	Tv(){ super(220);     //tv의 가격 설정
	}
	public String toString() {
		return "LG OLED TV";
	}
}
class Computer extends Product {
	Computer() {
		super(250);
	}
	public String toString() {
		return "LENOVO YOGA";
	}
}
class Audio extends Product {
	Audio(){
		super(450);
	}
	public String toString() {
		return "GENEVA";
	}
}

class Buyer {
	int money = 1000;
	int bonusPoint = 0;
	Product[] cart = new Product[10];   //import 해줘야 함.
	int i = 0;

	/*void buy(TV t) {
	money -= t.price; //money 에서 tv 가격 차감
	bonusPoint += t.bonusPoint;
    } 
	void buy(Computer c) {
		money -= c.price; //money 에서 tv 가격 차감
		bonusPoint += c.bonusPoint;
	}
	 
	void buy(Audio a) {
		money -= a.price; //money 에서 tv 가격 차감
		bonusPoint += a.bonusPoint;
	}*/
	void buy(Product p) {
		if(money<p.price) {
			System.out.println("잔액이 부족합니다.");
			//break : 동작은 똑같이 진행됨 
		    return;
		}
		money -= p.price; //부모 타입을 상속받아 한 메소드로 위 세개 메소드를 작성한 효과. p: product
		bonusPoint += p.bonusPoint;
        cart[i++] = p;
        System.out.println(p+"를 구입하셨습니다.");
	}
	void summary() {
		int sum = 0; 
		String itemList = "";
		for(int i=0; i<cart.length; i++) {
			if(cart[i] != null) {
				sum += cart[i].price;
				itemList += cart[i]+ " , ";
			}
		}
		System.out.println("총 구입금액 : " + sum);
		System.out.println("구입물품목록 : " + itemList);
	}
}
public class ProductEx {
	public static void main(String[] args) {
		Buyer b1 = new Buyer();
		b1.buy(new Tv());
		b1.buy(new Computer());
		b1.buy(new Audio());
		b1.summary();
		System.out.println("현재 잔액 : "+b1.money);
		System.out.println("적립된 포인트 : "+b1.bonusPoint);
	}

}
