package Ch11;
import java.util.*;
public class HashSetEx3 {
	public static void main(String[] args) {
		HashSet setA = new HashSet();
		HashSet setB = new HashSet();
		setA.add("1");
		setA.add("2");
		setA.add("3");
		setA.add("4");
		setA.add("5");
		System.out.println("A = "+ setA);
		setB.add("4");
		setB.add("5");
		setB.add("6");
		setB.add("7");
		setB.add("8");
		System.out.println("B = "+ setB);
		HashSet setHab = new HashSet();
		HashSet setKyo = new HashSet();
		HashSet setCha = new HashSet();
		
		//합집합 
		Iterator it = setA.iterator();
		while(it.hasNext())
			setHab.add(it.next());  
		it = setB.iterator();
		while(it.hasNext())
			setHab.add(it.next());  
		System.out.println("A U B ="+setHab);
		//교집합
		it = setA.iterator();
		while(it.hasNext()) {
			Object tmp = it.next();
			if(setB.contains(tmp))  //setB에 setA의 요소를 포함하고 있으면 setKyo에 add
				setKyo.add(tmp);
		}
		System.out.println("A ∩ B ="+setKyo);
		//차집합 (A-B)
		it = setA.iterator();
		while(it.hasNext()) {
			Object tmp = it.next();
			if(!setB.contains(tmp))  //setA의 요소가 setB에 없으면 포함하고 있으면 setCha에 add
				setCha.add(tmp);
		}
		System.out.println("A - B ="+setCha);
	}

}
