package March0330;
class AAA{
	public void method() {
		II i = InstanceMGR.getInstance();
		i.play();   //BBB 클래스의 play 메소드 호출
		System.out.println(i.toString());
	}
}
class BBB implements II{   //관계를 맺어줌 
    public void play() {
		System.out.println("BBB.play()");
		
	}
	public String toString() {
		return "class BBB";
	}
}
interface II{
	public abstract void play();
}
class InstanceMGR{   //BBB클래스의 객체 제공 
	public static II getInstance() {
		return new BBB();
	}
}
public class InterfaceEx3 { 
	public static void main(String[] args) {
		AAA aa = new AAA();
		aa.method();
		
	}

}
