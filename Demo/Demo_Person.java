package Demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Demo_Person {
    public static void main(String[] args) {
    	
    	Scanner s = new Scanner(System.in);
    	List<Person> lists = new ArrayList<>();
    	lists.add(new Adult());
    	lists.add(new Child());
    	int total = 0;
    	int a;
    
    	for(int i=1; i<=10; i++) {
    		a = s.nextInt();
    		if(a == 1)
    			lists.add(new Adult());
    		else if(a == 2)
    			lists.add(new Child());
    	}
    	for (Person p : lists) {
			total += p.getprice();    //child, adult 값 합계 계산
		}
    	
    	System.out.println(total);
    	
	
    }

}
