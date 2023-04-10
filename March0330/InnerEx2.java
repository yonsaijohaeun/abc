package March0330;
public class InnerEx2 {  //outer: InnerEx2
	Integer num1 = 0;   //오토박싱
	static Integer num2 = 0;
	class Inner{ int innerNum = 100;	} 
	static class SInner{ static int sinnerNum = 500;	}  //static으로 SInner 
	void print() {
		SInner s1 = new SInner();
	}
//	InnerEx2 outer = new InnerEx2();       
//	InnerEx2.Inner inner = outer.new Inner();
//	InnerEx2.SInner sinner = new SInner();   //static한 것은 그냥 만들어라.static 클래스는 이중틀
	
	public static void main(String[] args) {		
		Integer mainNum2 = num2;
		
		InnerEx2 outer = new InnerEx2();    
		Integer mainNum = outer.num1;
		
		InnerEx2.Inner inner1 = outer.new Inner();
		InnerEx2.Inner inner2 = outer.new Inner();
		System.out.println(inner1 == inner2);  //false
		System.out.println(inner1.innerNum); 
		
//	    SInner sinner1 = new SInner();   //static한 것은 그냥 만들어라.static 클래스는 이중틀
//	    SInner sinner2 = new SInner();
//	    System.out.println(sinner1 == sinner2);   
	    System.out.println(SInner.sinnerNum); 
	}

}
