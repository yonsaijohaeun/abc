package Ch11;
import static java.util.Collections.*;  //addAll, rotate, swap, shuffle...등 포함되어있다.
import java.util.*;
public class CollectionsEx {
	public static void main(String[] args) {
		List list = new ArrayList();
		System.out.println(list);
		addAll(list, 1,2,3,4,5);
		System.out.println(list);
		rotate(list, 2);  //두 번 rotate 
		System.out.println(list);
		swap(list, 0 ,2); //[0]번과 [2]번 자리 바꿈
		System.out.println(list);
		shuffle(list);
		System.out.println(list);
		sort(list);
		System.out.println(list);
		sort(list, reverseOrder());   //reverseOrder: Comparator
		System.out.println(list);
		int idx = binarySearch(list,3);  //[3]에 대한 index = 2
		System.out.println("index of 3 = "+idx);
		System.out.println("max = "+max(list));
		System.out.println("min = "+min(list));
		System.out.println("min = "+max(list,reverseOrder()));
		fill(list,9);
		System.out.println("list = "+list);
		List newList = nCopies(list.size(),2);  //기존의 list를 size만큼 복사해 2로 채운다
		System.out.println("newList = "+newList);
		System.out.println(disjoint(list,newList));
		copy(list,newList);
		System.out.println("newList = "+newList);
		System.out.println("list = "+list);
		replaceAll(list,2,1);
		System.out.println("list = "+list);
		Enumeration e = enumeration(list);
		ArrayList list2 = list(e);  // list(e) : 'l' 소문자
		System.out.println("list2 = "+list2);
		System.out.println(list == list2);
	}

}
