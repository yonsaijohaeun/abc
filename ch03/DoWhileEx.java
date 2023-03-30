package ch03;

public class DoWhileEx {

	public static void main(String[] args) {
		char c = 'a';
	    do {
	    	System.out.print(c);
	    	c = (char)(c+1);          //char 타입이 정수 타입이랑 호환됨. char 타입으로 캐스팅 	
	    }while(c<='z');
	   
	}

}
