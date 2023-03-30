package Ch05;

public class InheritanceEx {

	public static void main(String[] args) {
		Person s = new Student();
		//s.set();
		s.setAge(10);
		System.out.println(s.age); //age는 자식거에 있는걸 가져다 써서 10+50 = 60 찍힘. 
		//System.out.println(s.name+"은 나이가 "+s.age+"살이고 키는 "+s.height+"cm이고 몸무게는 "+s.getWeight()+"kg 입니다.");

	}

}
class Student extends Person{
	private int grade;
	private int schoolClass;
	//int age;    // this.age 
	
	//super 클래스 생성자 호출 
	/*public Student () {
		super();
		System.out.println("Student Class instructor");
	}*/
	//
	
	public void set() {
		age = 30;
		name = "홍길동";
		height = 175;
		//weight = 99;
		setWeight(99);
	}
	public void setAge(int age) {
		this.age = age+50;
	}
}
class Person {
	private int weight;
	int age;
	protected int height;
	public String name;
	public Person() {
		super();
		System.out.println("Person Class instructor");
	}
	public void setWeight(int weight) {
		this.weight = weight;
		}
	public int getWeight() {
		return weight;
		}
	public void setAge(int age) {
		this.age = age;     //this.age = this.age + age
	}
}







