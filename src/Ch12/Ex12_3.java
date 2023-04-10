package Ch12;
import java.util.*;
class Student2 {
	String name;   int grade;    int ban; 
	int kor;       int eng;      int math;

	public Student2(String name, int grade, int ban, 
			               int kor, int eng, int math) {  //생성자 (using fields)
		super();
		this.name = name;  this.grade = grade;
		this.ban = ban;    this.kor = kor;
		this.eng = eng;    this.math = math;
	}
}
public class Ex12_3 {
	public static void main(String[] args) {
		HashMap<String, Student2> map 
		   = new HashMap<String,Student2>(); //학생을 값으로 받음
		map.put("홍길동", new Student2("홍길동",1,1,100,95,90));  //이름(키값), 학년, 반, 국,영,수
		map.put("강감찬", new Student2("강감찬",2,3,85,95,70)); 
		map.put("이순신", new Student2("이순신",3,1,95,95,90)); 
		map.put("유관순", new Student2("유관순",1,4,88,97,90)); 
	    System.out.println(map.get("강감찬").eng);   //'강감찬' 객체의 영어점수 출력 
	    System.out.println(map.get("유관순").kor);
	}
}
