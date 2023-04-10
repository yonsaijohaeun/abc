package March0331;
class Point{ int x,y;  
     Point(int x, int y) {
    	 this.x = x;
    	 this.y = y; 
    	 }
	public String toString() {
		return "x="+x+", y="+y;
	}
     
}
class Circle implements Cloneable{
	Point p;
	double r;
	public Circle(Point p, double r) {     //source -> usigfields
		super();
		this.p = p;
		this.r = r;
	}
	public String toString() {
		return p.toString() +" , r=" + r;
	}
	protected Circle shallowCopy() {
		Object obj = null;
		try {
			obj = super.clone();
		} catch (CloneNotSupportedException e) {		}
		return (Circle)obj;  //캐스팅해서 리턴
	}
	protected Circle deepCopy() {
		Object obj = null;
		try {
			obj = super.clone();
		} catch (CloneNotSupportedException e) {		}
		Circle c = (Circle)obj;
		c.p = new Point(this.p.x, this.p.y);
		return c;
	}
}
public class Ex09_2 {
	public static void main(String[] args) {
		Circle c1 = new Circle(new Point(5,4),3.4);
		Circle c2 = c1.shallowCopy();
		Circle c3 = c1.deepCopy();
		System.out.println("c1: " + c1); 
		System.out.println("c2: " + c2); 
		System.out.println("c3: " + c3);
		c1.p.x = 8; 
		c2.p.y = 3;
		System.out.println("==========================");
		System.out.println();
	}

}
