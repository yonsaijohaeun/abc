package Ch06;
class Shape {
	protected String name;
	public void paint() {
		draw();
	}
	public void draw() {
		System.out.println(name);
	}
}
public class Circle5 extends Shape{
	protected String name;
	
	@Override
	public void draw() {
		name = "Circle5";
		super.name = "Shape";
		super.draw();
		System.out.println(name);		
		
	}
	public static void main(String[] arg) {
		Shape b = new Circle5();
		b.paint();
	}

}
