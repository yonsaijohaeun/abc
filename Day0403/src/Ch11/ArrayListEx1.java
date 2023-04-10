package Ch11;
import java.util.*;
class ArrayListEx1 {
	public static void main(String[] args) {
		ArrayList list1 = new ArrayList(10);
		list1.add(5);
		list1.add(4);
		list1.add(2);
		list1.add(0);
		list1.add(1);
		list1.add(3);
		ArrayList list2 = new ArrayList(list1.subList(1, 4));
		print(list1,list2);
		Collections.sort(list1);    //list1과 list2를 정렬
		Collections.sort(list2);    //collections.sort(list 1)
		print(list1,list2);
		System.out.println("list1.containsAll(list2):"+ list1.containsAll(list2));
		list2.add("B");
		list2.add("C");
		list2.add(3, "A");
		print(list1, list2);	
		list2.set(3, "AA");  //3위치에 A를 AA로 바꿔
		print(list1, list2);
		
		//list1에서 list2와 겹치는 부분만 남기고 나머지는 삭제.   0,2,4
		System.out.println("list1.retainAll(list2):" + list1.retainAll(list2));
		print(list1, list2);
		
		// list2에서 list1에 포함된 객체들을 삭제한다.
		for (int i =list2.size()-1; i>=0; i--) {
			if(list1.contains(list2.get(i)))
				list2.remove(i);
		}
		print(list1,list2);
		
	} //main의 끝
	static void print(ArrayList list1, ArrayList list2) {
		System.out.println("list1:"+list1);
		System.out.println("list2:"+list2);
		System.out.println();
	}

}
