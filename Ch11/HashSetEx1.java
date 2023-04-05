package Ch11;
import java.util.*;

public class HashSetEx1 {

	public static void main(String[] args) {
		Object[] objArr = {"1",1,"2","2","3","3","4","4","4"};
		Set set = new HashSet();
		for(int i=0; i<objArr.length; i++) {
			set.add(objArr[i]);  //요소를 set에 담는다
		}
		System.out.println(objArr); //주소 들어감
		System.out.println(set);   //한개씩 들어감 (1은 int, String으로 타입별로)
   
	}

}
