package Ch07;
class Tv{
	boolean power;
	int channel;
	void power() { power = !power; }
	void channelUp() {++channel; }
	void channelDown() {--channel;}
	@Override
	public String toString() {
		return "Tv [power= " + power + ", channel=" + channel + "]";
	}
	
}
class CaptionTv extends Tv{
	String text="Caption";
	void caption() {   }
	@Override
	public String toString() {
		return "CaptionTv [text=" + text + "]";
	}
	
}
class LcdTv extends Tv{
	String pixel="LcdTv";

	@Override
	public String toString() {
		return "LcdTv [pixel=" + pixel + "]";
	}
	
}
class SmartTv extends Tv{
	String cpu="SmartTv";

	@Override
	public String toString() {
		return "SmartTv [cpu=" + cpu + "]";
	}
	
}
public class Tvtest2 {
	public static void main(String[] args) {
	  Tv t1 = new CaptionTv();
	  Tv t2 = new LcdTv();
	  Tv t3 = new SmartTv();
	  print(t1);print(t2);print(t3);
	  
	}
	static void print(Tv t) { 	
	  //LcdTv lcd = (LcdTv)t; 
	  //System.out.println(lcd.pixel);
	  //System.out.println(t);
	  //System.out.println(t.pixel);   => pixel: 자식에 추가된 멤버로 보이지 않음.
	}

}
