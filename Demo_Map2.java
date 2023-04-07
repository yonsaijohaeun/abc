package Demo_1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Demo_Map2 {

	public static void main(String[] args) {
		Map<Integer, Map<String, Integer>> map = new HashMap<>();
		Scanner s = new Scanner(System.in);
		
		for(int i=0; i<3; i++) {
			Map<String, Integer> phonebookmap = new HashMap<>();
			String name = s.next();
			int num = s.nextInt();
			phonebookmap.put(name, num);
			map.put(i, phonebookmap);
			
		}
		System.out.println(map);  //for문 밖에 있어야 세번의 값 출력 가능
			
		
		}
	
}


