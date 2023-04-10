package Ch11;

import java.util.*;

public class HashMapEx2 {

	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("김자바", 90);  //이름: key, 점수: 값(value)
		map.put("김자바", 100);
		map.put("이자바", 100);
		map.put("강자바", 80);
		map.put("안자바", 90);
		Set set = map.entrySet();  // entry: '이름, 점수'의 한 쌍. map은 순서가 없다. 
		System.out.println(set);
		Iterator it = set.iterator();  
		while(it.hasNext()) {  //다음 요소가 있는 동안
			Map.Entry e = (Map.Entry)it.next();  //요소(entry) 하나하나를 지시
			System.out.println("이름 : "+e.getKey() + ", 점수: "+ e.getValue());
		}
		set = map.keySet();   //key에 대한 set (이름)
		System.out.println("참가자 명단 : "+ set);
		Collection values = map.values();  //값들의 묶음 
		it = values.iterator();  //값들의 묶음을 순회 
		int total = 0;
		while(it.hasNext()) {  
			Integer i = (Integer)it.next();
			total += i.intValue();
		}
		System.out.println("총점 : "+ total);
		System.out.println("평균 : "+ (float)total/set.size());   //set.size: 객체 개수
		System.out.println("최고점수 : " + Collections.max(values));
		System.out.println("최저점수 : " + Collections.min(values));

	}

}
