package Ch12;
import java.util.*;
class Fruit implements Eatable{ public String toString() {  return "Fruit";}}
class Apple  extends Fruit {  public String toString() { return "Apple";}}
class Orange extends Fruit{  public String toString() { return "Orange";}}
class Toy { public String toString() {  return "Toy";}}
interface Eatable{}
class FruitBox<T extends Fruit & Eatable> extends Box<T>{}   //과일이면서 먹을 수 있는
class Box<T>{  //과일을 담을 박스, 타입: 미정
	ArrayList<T> list = new ArrayList<T>();
	void add(T item) {list.add(item);}
	T   get(int i){return list.get(i);}
	int size() { return list.size();}
	public String toString() { return list.toString();}
}

public class Ex12_4 {
	public static void main(String[] args) {
		FruitBox<Fruit> fBox = new FruitBox<Fruit>();
		FruitBox<Apple> aBox = new FruitBox<Apple>();		
		FruitBox<Orange> oBox = new FruitBox<Orange>();
//		FruitBox<Toy> tBox = new FruitBox<Toy>();   //Eatable 하지 않아서.
		fBox.add(new Fruit());
		fBox.add(new Apple());
		fBox.add(new Orange());
		aBox.add(new Apple());
		oBox.add(new Orange());
		oBox.add(new Orange());
		System.out.println("fruitBox-"+fBox);
		System.out.println("AppleBox-"+aBox);
		System.out.println("OrangeBox-"+oBox);
	
		
		
	}
}
