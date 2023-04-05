package Demo_1;

public class Adult extends Person{
	//int age;
	static int count = 0;
	public Adult() {
		count++;
	};  //생성자
//	public Adult(int age) { //메소드 오버로딩
//		this.age = age;
//	};  
//	public Adult(int a, int b) {};  //
	
		
	
	

	@Override
	public int getprice() {
		
		return super.getprice();
	}
 
}
