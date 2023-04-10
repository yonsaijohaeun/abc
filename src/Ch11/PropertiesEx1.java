package Ch11;
import java.util.*;
public class PropertiesEx1 {
	public static void main(String[] args) {
		Properties prop = new Properties();
		//prop에 키와 값을 저장한다.
		prop.setProperty("timeout", "30");
		prop.setProperty("language", "kr");
		prop.setProperty("size", "10");
		prop.setProperty("capacity", "10");
		//prop에 저장된 요소들을 Enumeration을 이용해서 출력한다.
		Enumeration e = prop.propertyNames(); //이름(timeout 등)을 enumeration얻음
		while(e.hasMoreElements()) {
			String element = (String)e.nextElement();
			System.out.println(element + "=" + prop.getProperty(element)); //getProperty: 값이 나온다
		}
		System.out.println();
		prop.setProperty("size", "20");  // size의 값을 20으로 변경한다.
		System.out.println("size="        + prop.getProperty("size")); //value 값 return
		System.out.println("capacity="    + prop.getProperty("capacity","20"));
		System.out.println("loadfactor="  + prop.getProperty("loadfactor", "0.75"));
		
		System.out.println(prop);  //prop의 레퍼런스.{size=20, language=kr, timeout=30, capacity=10} 
		prop.list(System.out);    //prop에 저장된 요소들을 화면에 출력

	}

}
