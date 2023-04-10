package March0331;

import java.util.StringJoiner;

public class JoinnerEx {

	public static void main(String[] args) {
		String animals = "dog, cat, bear";
		String[] arr = animals.split(",");   //문자열을 ','구분자로 나눠서 배열에 저장
		String str = String.join("-", arr);  //배열의 문자열을 '-'로 구분해서 결합 
		System.out.println(str);
		
		StringJoiner sj = new StringJoiner(":","[", "]"); //':' 가 구분자.
		sj.add("George").add("Sally").add("Fred");
		String desireString = sj.toString(); 
		System.out.println(desireString);

	}

}
