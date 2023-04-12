package Ch15;
public class ThreadEx4 {  
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();  //현재시간 
		for(int i=0; i<500; i++) {
			System.out.printf("%s",new String("-"));
		}
		System.out.println("소요시간: "+(System.currentTimeMillis()-startTime));
		
		for(int i=0; i<500; i++) {
			System.out.printf("%s",new String("|"));
		}
		System.out.println("소요시간: "+(System.currentTimeMillis()-startTime));
	}
}