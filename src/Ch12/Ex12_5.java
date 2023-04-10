package Ch12;
import java.util.*;
class Fruit2 { public String toString() {  return "Fruit2";}}
class Apple2  extends Fruit2 {  public String toString() { return "Apple2";}}
class Orange2 extends Fruit2{  public String toString() { return "Orange2";}}
class FruitBox2<T extends Fruit2> extends Box2<T>{}   //과일이면서 먹을 수 있는
class Box2<T>{  //과일을 담을 박스, 타입: 미정
	ArrayList<T> list = new ArrayList<T>();
	void add(T item) {list.add(item);}
	T   get(int i){return list.get(i);}
	ArrayList<T> getList() {return list;} 
	int size() { return list.size();}
	public String toString() { return list.toString();}
}

class Juice{
	String name;
	Juice(String name){this.name = name + "Juice";}  //생성자, Juice 메소드
	@Override 
	public String toString() {return name;}}  //toString 메소드
class Blander{ 
	static <T extends Fruit2> Juice makeJuice(FruitBox2<? extends Fruit2> box) {
//	static Juice makeJuice(FruitBox2<? extends Fruit2> box){  //Fruit과 Fruit 자식들
		String tmp = "";
		for(Fruit2 f : box.getList())
			tmp += f + " ";
		return new Juice(tmp);
	}
	
}



public class Ex12_5 {
	public static void main(String[] args) {
		FruitBox2<Fruit2> fBox = new FruitBox2<Fruit2>();
		FruitBox2<Apple2> aBox = new FruitBox2<Apple2>();		
		fBox.add(new Apple2());
		fBox.add(new Orange2());
		aBox.add(new Apple2());
		aBox.add(new Apple2());
	
		System.out.println(Blander.makeJuice(fBox));
//		System.out.println(Blander.makeJuice(aBox));
		System.out.println(Blander.<Fruit2>makeJuice(aBox));

		
		
	}
}
