package ch04;
public class Circle2 {
		int radius;           
	    public Circle2(int radius) {
	    	this.radius = radius;
	    }
	    public double gerArea() {
	    	return 3.14*radius*radius;
	    }
	    
	    public static void main(String[] args) {
	    	Circle3[] c;
	    	c = new Circle3[5];
	    	System.out.println(c);            //배열 타입의 주소 출력
	    	for(int i=0; i<c.length; i++) {
	    		c[i] = new Circle3(i);
	    		System.out.println(c[i]);     //배열 객체의 주소 출력 
	    	}
	       	for(int i=0; i<c.length; i++) {
	    		System.out.print(c[i].gerArea()+" ");
	    	}
	    }
}
