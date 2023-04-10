package Ch12;

import java.util.*;

class Product {String brand; int price;}
class Tv extends Product {
	int size;

	@Override
	public String toString() {
		return  "brand=" +brand+", size="+size+", price="+ price;
	}
	
}
class Audio extends Product {
	int volume;

	@Override
	public String toString() {
		return  "brand="+brand+", volume="+volume+", price= "+price;
	}
}
public class Ex12_1 {
	public static void main(String[] args) {
		ArrayList<Product> proArr = new ArrayList<Product>(); 
		ArrayList<Tv> tvarr = new ArrayList<Tv>(); 
//		ArrayList<Product> arr2 = new ArrayList<Tv>();  //오류 
		List<Tv> arr2 = new ArrayList<Tv>(); 
		Tv t1 = new Tv();
		t1.brand = "Samsung"; t1.price = 1000000; t1.size = 50;
		proArr.add(t1);
		Tv t2 = new Tv();
		t2.brand = "LG"; t2.price = 1200000; t2.size = 50;
		proArr.add(t2);
		
		Audio a1 = new Audio();
		a1.brand="Yamaha"; a1.volume=300; a1.price=50000;
		Audio a2 = new Audio();
		a2.brand="Panassonic"; a2.volume=200; a2.price=80000;
//		proArr.add(new Tv());
		proArr.add(t1);   proArr.add(t2);
		proArr.add(a1);   proArr.add(a2);
		tvarr.add(t1);     tvarr.add(t2); 
		printAll(proArr);
//		printAll(tvArr);  //오류: Tv 타입 ArrayList라서 
		
//		proArr.add(new Tv());
//		proArr.add(new Audio());
//		tvarr.add(new Tv());  
//		tvarr.add(new Audio()); // tvarr은 Tv타입만 가능.
// 		System.out.println(proArr);
//		System.out.println(tvarr);
		
	}
	public static void printAll(ArrayList<Product> list) {
		for(Product p: list) {
			System.out.println(p);
		}
	}

}
