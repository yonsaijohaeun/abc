package Ch06;

class BlockTest {
   static {
      System.out.println("static { }");          //static {}부터  수행됨
   }
   {
	   System.out.println("{ }");  //초기화 블럭 
   }
   public BlockTest() {
	   System.out.println("생성자");
   }	
   public static void main(String[] args) {
	   System.out.println("BlockTest bt = new BlockTest(); ");
	   BlockTest bt = new BlockTest();    
	   System.out.println("BlockTest bt2= new BlockTest(); ");
	   BlockTest bt2 = new BlockTest(); 
   }
}
//BlockTest: 초기화 블럭이 수행되고 생성자 블럭이 수행됨