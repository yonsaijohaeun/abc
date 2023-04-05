package Ch11;

public class HashSetEx {

	public static void main(String[] args) {
		Person p1 = new Person ("David", 10);   // Person(String name, int age)
		Person p2 = new Person ("David", 10);
		boolean b = p1.equals(p2);
		System.out.println(b);
     	int hashCode1 = p1.hashCode();
		int hashCode2 = p1.hashCode(); 
		System.out.println(hashCode1);   
		System.out.println(hashCode2);   
 

	}

}
