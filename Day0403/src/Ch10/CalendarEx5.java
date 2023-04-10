package Ch10;
import java.util.*;

class  CalendarEx5 {
	public static void main(String[] args) {
		Calendar date = Calendar.getInstance();

		date.set(2015, 11, 31);	// 2005년 12월 31일
		System.out.println(toString(date));
		date.roll(Calendar.MONTH, 1);      //roll: 월만 회기된다. 연도의 값은 영향을 미치지 않는다.
		System.out.println(toString(date));
	}

	public static String toString(Calendar date) {
		return date.get(Calendar.YEAR)+"년 "+ (date.get(Calendar.MONTH)+1) +"월 " + date.get(Calendar.DATE) + "일";
	}
}
