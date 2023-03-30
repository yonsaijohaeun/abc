package Ch07;
class AA{
	public void method(I obj) {
		obj.play();
	}
}
interface I{
	public abstract void play();
}
class BB implements I{   //관계를 맺어줌 
    public void play() {
		System.out.println("BB.play()");
	}	
}
class CC implements I{
    public void play() {
    	System.out.println("CC.play()");
	}	
}
public class InterfaceEx2 {
	public static void main(String[] args) {
		AA aa = new AA();
		aa.method(new BB());
		aa.method(new CC());
	}

}
