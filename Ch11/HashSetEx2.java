package Ch11;
import java.util.*;
public class HashSetEx2 {
	public static void main(String[] args) {
		HashSet set = new HashSet();
		set.add("abc");
		set.add("abc");
		set.add(new Person("홍길동",20));
		set.add(new Person("홍길동",20));
		System.out.println(set);
   
	}

}
