package Paint;

import java.util.Objects;

abstract class Shape { // 추상 클래스 선언
	public Shape() { }
	public void paint() { draw(); }
	abstract public void draw(); // 추상 메소드
}
class Circle extends Shape{                // 이미 있다고 뜨면 우클릭-> source-> override/implement method 클릭.
	int x,y;
	double radious;
	public void draw() {
	System.out.println("Circle");
		
	
}
@Override
	public String toString() {
		return "Circle [x=" + x + ", y=" + y + ", radious=" + radious + "]";
	}

//해시코드 
@Override
public int hashCode() {
	return Objects.hash(radious, x, y);   //멤버변수 radious, x, y를 가지고 만들음.
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Circle other = (Circle) obj;
	return Double.doubleToLongBits(radious) == Double.doubleToLongBits(other.radious) && x == other.x && y == other.y;
}


class Line extends Shape {
	public void draw() {
	   System.out.println("Line");
	}
}
public class AbstractEx {
	public void main(String[] args) {
		Shape circle = new Circle();
        Shape line = new Line();
        circle.draw(); line.draw();
        System.out.println(circle);
	}
  }


}
