package Ch11;
import java.util.*;

public class Comparator1 {   //Comparator 와 다른 이름으로 만들기 
	public static void main(String[] args) {
		Integer[] arr = {30, 50, 10, 40, 20};	
		Arrays.sort(arr);  //기본 정렬기준(Comparable)으로 정렬(오름차순)
		System.out.println(Arrays.toString(arr)); 
		
		Arrays.sort(arr, new DescComp());  //DescComp에 구현된 정렬기준으로 정렬
		System.out.println(Arrays.toString(arr));
		
	}

}
class DescComp implements Comparator {
	public int compare(Object o1, Object o2) {
		if(!(o1 instanceof Integer)) return -1;
		if(!(o2 instanceof Integer)) return -1;
		Integer i = (Integer)o1;
		Integer i2 = (Integer)o2;
		//return i2-i; 또는 return i2.compareTo(i);도 가능 
		return i.compareTo(i2)*-1;   //기본 정렬방식의 반대 
	}
}