package GenerTest2;
import java.util.*;

class Box<T>{
	T item;
	void setItem(T item) {this.item = item;}
	T getItem() {return this.item;}
	
} 
public class Ex12_4 {
	public static void main(String[] args) {
		Box<String> b = new Box<String>();  // Box 스트링 타입으로 b 만듦
		b.setItem("홍길동");
		b.setItem("ABCD");
		String s1 = b.getItem();
		System.out.println(s1);
		
	}
}
