package Demo_1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Demo_Map {
public static void main(String[] args) {
			Map<Integer, List<Person>> map = new HashMap<>();  //키:Integer , value: person이 있는 List
			for(int i=0; i<10; i++) {
				List<Person> lists = new ArrayList<>();
				lists.add(new Adult());
				map.put(i,lists); 
			}
			for (Integer key : map.keySet()) {  //키를 Integer로 줌.
				System.out.println(map.get(key));
			}
	
}

}
