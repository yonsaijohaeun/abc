package March0331;

public class StrBuffer {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("abc");
		sb.append("123");
		//append 메소드의 결과는 자기 자신을 return
		StringBuffer sb2 = sb.append("zzz");
		System.out.println(sb);
		System.out.println(sb2);
		System.out.println(sb == sb2); 
		System.out.println(sb.equals(sb2));   //상태값 비교
		String s = sb.toString();   //변환된 스트링 객체
		String s2 = sb2.toString();
		System.out.println(s.equals(sb));  //변환된 스트링 객체랑 원래 sb(스트링버퍼)와 비교 

	}

}
