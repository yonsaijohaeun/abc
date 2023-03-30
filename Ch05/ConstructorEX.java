package Ch05;
class A{
	public A() {
		System.out.println("생성자 A");
	}
}
class B extends A{
	/*int a, b;*/ 
	public B() {
		/*super();*/
		System.out.println("생성자 B");
	}
}

class C extends B{
	public C() {
		System.out.println("생성자 C");
	}
}

public class ConstructorEX {

	public static void main(String[] args) {
		C c = new C(); 
	}

}
