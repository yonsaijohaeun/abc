package Ch11;
import java.util.*;
public class TreeSetEex3 {
	public static void main(String[] args) {
		Set set = new TreeSet(new TestComp());    //정렬되어 출력, 기준을 주어야함(객체로)
//		Set set = new HashSet();    //정렬 안되어서 출력
		for(int i=0; set.size()<6; i++) {
//			int num = (int)(Math.random()*45)+1;   //로또 방식으로 출력(8~9행)
//			set.add(num);
			set.add(new Test());
			set.add(new Test());
			set.add(new Test());
			set.add(new Test());
			set.add(5);
			
		}
		System.out.println(set);
	}

}
class Test implements Comparable{   //implements : 구현해야함(override)
    int x, y;
	@Override
	public int compareTo(Object o) {   
		return 1;
	}
}
class TestComp implements Comparator {   //Comparator : 정렬기준 
	@Override
	public int compare(Object o1, Object o2) {
		return 1;
	}
	
}