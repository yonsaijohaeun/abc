package Ch07;
public class BindingEx {
	public static void main(String[] args) {
		Parent p = new Child();
		Child  c = new Child();
		System.out.println("p.x ="+p.x);   //100
		p.method();
		System.out.println("c.x ="+c.x);   //200
		c.method();
	}

}
class Parent {
	int x = 100;
	void method() {
		System.out.println("Parent method()");
	}
}
class Child extends Parent {
	int x = 200;
	void method() {
		System.out.println("Child method()");   //메소드는 자식이 재정의한 것을 출력 
		System.out.println(super.x);   //100
		System.out.println(this.x);    //200
		super.method();   //parent method
		
		
		
		
		/*
		class parent {
		   int x = 10;
		}
		
		class Child extends Parent {
	      void method() {
		    System.out.println(x);   //10 찍힘 
		    System.out.println(super.x);   //100
		    System.out.println(this.x);    //200
		    super.method();   //parent method
		 
		*/
		
	}
}
