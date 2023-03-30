package ch03;

public class NestedLoop {

	public static void main(String[] args) {
		/*for(int i=2; i<10; i++) {
			//System.out.print(i);
			for(int j=2; j<10; j++) {
				System.out.print(j+" x "+i+" = "+i*j);
				System.out.print("\t");
			}
			System.out.println();
		
			
		}*/
		
		
		//3단씩 나눠서 출력하기 해봐!
		for(int i=2; i<10; i++) {
			//System.out.print(i);
			for(int j=2; j<10; j++) {
				System.out.print(j+" x "+i+" = "+i*j);
				System.out.print("\t");
			}
			System.out.println();
		}

	}

}
