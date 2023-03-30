package Ch05;
public class ArrParamEx {
	static void replaceSpace(char[] a) {
		for (int i = 0; i < a.length; i++)
			if (a[i] == ' ')
				a[i] = ',';       // a 배열의 i번째 방의 공백을 ','로 바꿔
	}
	static void printCharArray(char a[]) {
		for (int i = 0; i < a.length; i++)
			System.out.print(a[i]);
		System.out.println();
	}
	public static void main (String args[]) {
		char[] c = {'T','h','i','s',' ','i','s',' ','a',' ','p','e','n','c','i','l','.'};
		printCharArray(c);
		replaceSpace(c);
		printCharArray(c);
		System.out.println(c);
		String s = "Hello!!(*,*)"; System.out.println(s);        
		System.out.println(s);
		System.out.println(s.toString());
		
	}
}
