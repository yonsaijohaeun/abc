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
	String pixel="5000픽셀";

	@Override
	public String toString() {
		return "LcdTv [pixel=" + pixel + "]";
	}
	
}
class SmartTv extends Tv{
	String cpu="라이젠7";

	@Override
	public String toString() {
		return "SmartTv [cpu=" + cpu + "]";
	}
	
}
public class Tvtest {
	public static void main(String[] args) {
	  CaptionTv t1 = new CaptionTv();
	  LcdTv t2 = new LcdTv();
	  SmartTv t3 = new SmartTv();
	  print(t1);print(t2);print(t3);
	  
	}
	static void print(Tv t) { 	
	   CaptionTv ctv = null;
	   LcdTv lcd = null;
	   SmartTv stv = null;
	   if(t instanceof CaptionTv) {
		   ctv = (CaptionTv)t;
		   System.out.println(ctv.text);
	   }
	   else if(t instanceof LcdTv) {
		   lcd = (LcdTv)t;
		   System.out.println(lcd.pixel);
	   }
	   else if(t instanceof SmartTv) {
		   stv = (SmartTv)t;
		   System.out.println(stv.cpu);
	   }
	  //LcdTv lcd = (LcdTv)t; 
	  //System.out.println(lcd.pixel);
	  //System.out.println(t);
	  //System.out.println(t.pixel);   => pixel: 자식에 추가된 멤버로 보이지 않음.
	}

}
