package Ch12;
enum Direction2 {
	EAST(1,">"), SOUTH(2,"V"), WEST(3,"<"), NORTH(4,"^");
    private static final Direction2[] DIR_ARR = Direction2.values();
    private final int value;
    private final String symbol;
    Direction2(int value, String symbol) {
    	this.value = value;
    	this.symbol = symbol;
    }
    public int getValue()       {   return value;   }
    public String getSymbol()   {   return symbol;  }  
    public static Direction2 of(int dir) { //of(): of메서드.
    	if (dir < 1 || dir>4) {
    		throw new IllegalArgumentException("Invalid value :"+dir);
    	}
    	return DIR_ARR[dir-1]; //배열이 0부터 시작하기 때문에 
    }
    //방향을 회전시키는 메서드. num의 값만큼 90도씩 시계방향으로 회전한다. 
    public Direction2 rotate(int num) {
    	num = num % 4;
    	if(num < 0) num +=4; //num이 음수일 때는 시계반대방향으로 회전
    	return DIR_ARR[(value-1+num) % 4];  //value-1: 배열 방 번호
    }
    public String toString() {
    	return name()+getSymbol();
    }
	
}   //enum Direction
class EnumEx2 {
      public static void main(String[] args) {
		for (Direction2 d : Direction2.values()) {
			System.out.printf("%s=%d%n", d.name(), d.getValue());			
		Direction2 d1 =	Direction2.EAST;
		Direction2 d2 =	Direction2.of(1);
		System.out.printf("d1=%s, %d%n", d1.name(), d1.getValue());
		System.out.printf("d2=%s, %d%n", d2.name(), d2.getValue());
		System.out.println(Direction2.EAST.rotate(1));
		System.out.println(Direction2.EAST.rotate(2));
		System.out.println(Direction2.EAST.rotate(-1));
		System.out.println(Direction2.EAST.rotate(-2));
			
		} 
	}

}
