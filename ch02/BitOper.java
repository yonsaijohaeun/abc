package ch02;

public class BitOper {

	public static void main(String[] args) {
//		short a = 0x55ff;            //short로 캐스팅하는 이유: 16진수 4자리-> 2바이트  
//		short b = 0x00ff;
//		System.out.printf("%04x\n", (a&b));    //16진수 4자리로
//	    System.out.printf("%04x\n", (a|b));
//      System.out.printf("%04x\n", (a^b));
//      System.out.printf("%04x\n", (~a));
	
	    byte c = 20;         //0x14 (16진수로 변환) 0001 0100               
	    byte d = -8;         //0xf8          00001000(8의 2진수)-> 역수 11110111 -> 1111 1000
	    System.out.println(c << 2);         //1010 0000
	    System.out.println(c >> 2);         //0000 0101
	    System.out.println(d >> 2);         //1111 1110
	    System.out.printf("%x\n",d >> 2);    //1111 1110
	    System.out.printf("%x\n",d >>> 2);   //0011 1110
	    
	}

}
