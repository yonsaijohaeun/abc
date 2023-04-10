package Generics;
import java.util.*;
class Fruit                {public String toString() {return "Fruit";}}
class Apple  extends Fruit {public String toString() {return "Apple";}}
class Orange extends Fruit {public String toString() {return "Orange";}}
class Box<T extends Object>{
	ArrayList<T> list = new ArrayList<T>();
	void add(T item) {list.add(item);}
	T    get(int i)  {return list.get(i);}
	int  size()      {return list.size();}
	public String toString() { return list.toString();}
}
class FruitBox<T extends Fruit> extends Box<T>{}   
public class Ex12_4 {
	public static void main(String[] args) {
		Box         box    = null;  //원시타입
		Box<Object> objBox = null; //제네릭타입
		box    = (Box)objBox; 
		objBox = (Box<Object>)box;
	    Box<? extends Object> wBox = new Box<String>();
	    String[] fArr = {"apple","orange","grape"};
		ArrayList fList = new ArrayList();
		objBox = (Box<Object>)wBox;
		objBox.add(fList);
		FruitBox<? extends Fruit> box1 = null;
		FruitBox<Apple> aBox = (FruitBox<Apple>)box1;
		
		Box<?> fBox  = new Box<Object>();
		Box<?> fBox2 = new Box<>(); //위와 같은 문장		
		
	}
}
