package Ch12;
//2번
/*class Book {
	Book() {
		System.out.println("Book 클래스 생성자 ~~");
	}
}

class ComputerBook extends Book {
	ComputerBook() {
		System.out.println("ComputerBook 클래스 생성자 ~~");
	}
}

public class Ex_11 {
	public static void main(String[] args) {
		ComputerBook sedan1 = new ComputerBook();
	}
	
}*/

//3번 
/*public class Ex_12 {
public static void main(String[] args) {
	ComputerBook b1 = new ComputerBook("굿 자바");
}

}
class Book {
   Book() {
	  System.out.println("Book 클래스 생성자 ~~ (파라미터 없음)");
   }
   Book(String name) {
	   this();
	   System.out.println("Book 클래스 생성자 -->" +name);
	   }
}

class ComputerBook extends Book{
	ComputerBook(String name) {
		super(name);
		System.out.println("ComputerBook 클래스 생성자 ~~");
	}
}
*/


//7번
public class Ex_12{
	public static void main(String[] args) {
		Whale tank1 = new Whale();
		tank1.bear();
		tank1.swim();
	}	
}
class Whale implements Animal, Fish {   //whale 의 add implements method 클릭 

	@Override
	public void swim() {
		System.out.println("고래는 새끼를 낳습니다.");
		
	}

	@Override
	public void bear() {
		System.out.println("고래는 물속에 삽니다");
	
	}
	
}


