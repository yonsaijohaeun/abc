package ch04;

public class Circle {
		int radius;           //멤버변수
		/*String name;
		public Circle() {}                 //이 라인은 없어도 있음. 컴파일러가 넣어줌. 
        public double gerArea() {
        	return 3.14*radius*radius;
        }
        public static void main(String[] args) {
            Circle pizza = new Circle();
            pizza.radius = 10;
            pizza.name = "자바피자";
            double area = pizza.gerArea();
            System.out.println(pizza.name + "의 면적은 " +area);
            
            Circle donut = new Circle();
            donut.radius = 2;
            donut.name = "자바도넛";
            area = donut.gerArea();
            System.out.println(donut.name + "의 면적은 " +area);
            
        }*/
		
		//객체 속에서의 this
	    public Circle(int radius) {
	    	this.radius = radius;
	    }
	    public void set(int radius) {
	    	this.radius = radius;
	    }
	    
	    public static void main(String[] args) {
	    	Circle ob1 = new Circle(1);
	    	Circle ob2 = new Circle(2);
	    	Circle ob3 = new Circle(3);
	    	
	    	ob1.set(4);
	    	ob2.set(5);
	    	ob3.set(6);
	    	System.out.println(ob1.radius);
	    	//ob2 =ob1 : ob2가 ob1을 가리키면서 ob2에 있던 값은 사라진다. 같은 객체를 지시. 
	    }
	

}
