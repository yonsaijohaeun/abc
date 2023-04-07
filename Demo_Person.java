package Demo_1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Demo_Person {
    public static void main(String[] args) {
    	List<Person> lists = new ArrayList<>();
    	Map<Integer, List<Person>> map = new HashMap<>();  //키:Integer , value: person이 있는 List
    	map.put(1,lists); 
   
    	
        Scanner s = new Scanner(System.in);
    	int count = 0;
    	int total = 0;
    	int num = 0;
        while(num !=5) {
        	System.out.println("1.입장객");
        	System.out.println("2.총수입");
        	System.out.println("3.관객수");
        	System.out.println("5.이전메뉴");
        	num = s.nextInt();
        	if(num == 1) {
               	   while(num !=4) {
        	       System.out.println("1. 어른");
        	       System.out.println("2. 청소년");
        	       System.out.println("3. 어린이");
        	       System.out.println("4. 이전메뉴");
        	       num = s.nextInt();
        	        	if(num == 1) {
        	        		lists.add(new Adult());
        	        	
        	        	}
        	        	else if(num == 2) {
        	        		lists.add(new Teen());
        	        		
        	        	}
        	        	else if(num == 3) {
        	        		lists.add(new Child());
        	        		
        	        	}
     	
        	        }
        	}
        	else if(num == 2) {
        		for (Person p : lists) {
        			total += p.getprice();    //child, adult 값 합계 계산
        		}
            	
            	System.out.println(total);
        	}
        	else if(num == 3) {
        		System.out.println(Adult.count);
        		System.out.println(Teen.count);
        		System.out.println(Child.count);
        	
        	}
        	

        }
 
    }

}
