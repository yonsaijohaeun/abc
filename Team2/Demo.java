package Team;

public class Demo {
	public static void main(String[] args) {
	
		Calc c = new Calc(10,10,"+");  
		Calc c2 = new Calc(10,10,"-");  
		c.calcOperation();    //출력문으로 감싸면 안됨
		c2.calcOperation();
	}
}
