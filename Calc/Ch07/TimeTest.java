package Ch07;
class Time {
	private int hour;
	private int minute;
	private int second;
	
	//8~13행->생성자: source-> using fields
	public Time(int hour, int minute, int second) {
		super();
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	public int getHour() {
		return hour;
	}
	public void setHour(int hour) {
		if(hour<0 || hour>23) return;  //hour가 0보다 작거나 23보다 크면 리턴
		this.hour = hour;
	}
	public int getMinute() {
		return minute;
	}
	public void setMinute(int minute) {
		if(minute<0 ||minute>59) return;
		this.minute = minute;
	}
	public int getSecond() {
		return second;
	}
	public void setSecond(int second) {
		if(second<0 ||second>59) return;
		this.second = second;
	}
	//37~39행: toString 
	@Override
	public String toString() {
		return hour + ":" + minute +":" + second;
	}
	
}
public class TimeTest {

	public static void main(String[] args) {
		 Time t1 = new Time(12,35,30);
		 System.out.println(t1);
		 t1.setHour(t1.getHour()+5);    //t1보다 5시간 후 시간 출력
		 System.out.println(t1);
		 
	}
}
