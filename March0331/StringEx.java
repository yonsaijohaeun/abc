package March0331;
public class StringEx {
	public static void main(String[] args) {
		String str1 = new String ("abc");
		String str2 = "abc";
		String str3 = "abc";      // 총 객체 두 개 만들어짐.
		String str4 = new String ("abc");
		System.out.println(str1 == str2);	 //false
		System.out.println(str2 == str3);	 //true
		System.out.println(str1 == str3);	 //false
		System.out.println(str1 == str4);	 //false
		System.out.println(str2.equals(str3));
		System.out.println(str1.equals(str3));
		String s5 = "";   //문자열은 ""; 처리 가능
		System.out.println(s5.hashCode());
//		char[] chArr = new char[0];
//		int[] intArr = {};
//		args[0] = "hello";      //방도 안만들어졌는데 값을 넣은 상황-> 오류발생
//		System.out.println(args[0]);
	    //char c = ''; //char 타입은 '';으로 처리 불가.  ' ' 공백 필요
		
	}

}
