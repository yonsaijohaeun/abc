package Ch06;
class Data{int x;}
public class ReferenceParamEx {
	public static void main(String[] args) {
        
		Data d = new Data();
        d.x = 10;
        System.out.println("main(): x = "+d.x);
        change(d);
        System.out.println("After change(d)");
        System.out.println("main(): x = "+d.x); //refernce로 가져가서 1000이됨. 
	}
    static void change(Data d) {
    	d.x = 1000;
    	System.out.println("change(): x = "+d.x);
    }
}
