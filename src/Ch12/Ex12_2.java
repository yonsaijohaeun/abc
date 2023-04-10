package Ch12;

import java.util.*;

class Student {
	String name;   int grade;   int ban;

	public Student(String name, int grade, int ban) {  //생성자 (using fields)
		super();
		this.name = name;
		this.grade = grade;
		this.ban = ban;
	}
	
}
public class Ex12_2 {
	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<Student>();
		list.add(new Student("홍길동",2,3));
		list.add(new Student("강감찬",2,1));		
		list.add(new Student("이순신",3,4));
		list.add(new Student("유관순",3,4));
		Iterator<Student> it = list.iterator(); //Iterator 객체 얻어옴
		while(it.hasNext()) {  //요소가 있는동안
//			Student s = (Student)it.next();
//			System.out.println(s.name);  //이름 출력
			Student s = it.next();
			System.out.println(s.name);
		
		  
		}
//		System.out.println(list);  //객체 레퍼런스 출력
		

	}

}
