package Ch11;
import java.util.*;
public class ArrayListEx2 {
	public static void main(String[] args) {
		final int LIMIT = 10; //자르고자 하는 글자의 개수를 지정
		String source = "0123456789abcdefghijABCDEFGHIJ!@#$%^&*()ZZZ";   //문자열 길이 43개
		int length = source.length();
		
		List list = new ArrayList(length/LIMIT + 10);  //크기를 약간 여유있게 잡는다.
		
		for(int i=0; i<length; i+=LIMIT) {
			if(i+LIMIT <length )
				list.add(source.substring(i,i+LIMIT));
			else
				list.add(source.substring(i));
		}
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println(list);
		
	} //main()

}
