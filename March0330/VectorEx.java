package March0330;
import java.util.Vector;
class Product2 {
	int price2;
	public Product2 int price2) {
		this.price = price;
		this.bonusPoint = (int)(price*0.1);
	}
	int bonusPoint;
}
class Tv2 extends Product2 {	
	Tv2(){ super(220);     //tv의 가격 설정
	}
	public String toString() {
		return "LG OLED TV";
	}
}
class Computer2 extends Product2 {
	Computer2() {
		super(250);
	}
	public String toString() {
		return "LENOVO YOGA";
	}
}
class Audio2 extends Product2 {
	Audio2(){
		super(450);
	}
	public String toString() {
		return "GENEVA";
	}
}
class Buyer2 {
	int money = 1000;
	int bonusPoint = 0;
	Vector cart = new Vector();   //import 해줘야 함.
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
        cart.add(p);
        System.out.println(p+"를 구입하셨습니다.");
	}
	void refund(Product p) {
		if(cart.remove(p)) {
			money += p.price; //부모 타입을 상속받아 한 메소드로 위 세개 메소드를 작성한 효과. p: product
			bonusPoint -= p.bonusPoint;
			System.out.println(p+"제품을 반품하셨습니다.");
		}else 
			System.out.println("해당 제품이 카트에 없습니다.");
	
	
	}
	void summary() {
		int sum = 0; 
		String itemList = "";
		if(cart.size() == 0) {   //if(cart.isEmpty()) {} 로 해도 무방함. 
			System.out.println("구입하신 제품이 없습니다.");
			return;
		}
			
		for(int i=0; i<cart.size(); i++) {
				Product2 p = (Product2)cart.get(i);
				itemList += (i==0) ? p :","+ p ; //i가 0이면 제품명 붙이고, 아니면 ','를 붙이고 제품을 붙임 
				sum += p.price;
			
		}
		System.out.println("총 구입금액 : " + sum);
		System.out.println("구입물품목록 : " + itemList);
	}
}
public class VectorEx {
	public static void main(String[] args) {
		Buyer b1 = new Buyer();
		b1.summary();
		b1.buy(new Tv());
		b1.buy(new Computer());
		b1.buy(new Audio());
		b1.summary();
		System.out.println("현재 잔액 : "+b1.money);
		System.out.println("적립된 포인트 : "+b1.bonusPoint);
	}

}
