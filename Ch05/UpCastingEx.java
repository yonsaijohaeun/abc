package Ch05;
public class UpCastingEx {
   public static void main(String[] args) {
	   Person p = new Student("홍길동"); //실제 객체는 Student임. 업캐스팅
       Student s = (Student)p; // 정수 p를 Student 타입으로 다운캐스팅
       System.out.println(p.name);
       s.grade = 4;
       s.department = "사회학과";
       s.eat("해장국");
       s.study(5);
       s.run(s);
   }
}
class Person {
	String name;
	String id;
	public Person(String name) {
		this.name = name;
	}
	public void eat(String menu) {
		System.out.println(menu + "를 주문");
		
	}
	public void run(Student p1) {
		System.out.println(p1.name);
		p1.eat("랍스터");
	}
}
class Student extends Person{
	private int grade;
	private int department;
	public Student(String name) {
		super(name);
	}
	public void study(int hour) {
		System.out.println("오늘 공부한 시간"+hour);
	}
}

	
