package Ch11;
import java.io.*;
import java.util.*;
class PropertiesEx3 {
   public static void main(String[] args) {
      Properties prop = new Properties();
      prop.setProperty("timeout", "30");  //key, value를 쌍으로 준다
      prop.setProperty("language", "한글");
      prop.setProperty("size", "10");
      prop.setProperty("capacity", "10");
      try {
		prop.store(new FileOutputStream("output.txt"),"Properties Example");
		prop.storeToXML(new FileOutputStream("output.xml"),"Properties Example");
	  } catch (IOException e) {
		e.printStackTrace();
	  }
      
      Properties sysProp = System.getProperties();  //getProperties: Properties 여러개 갖고있는 객체 
      System.out.println(sysProp.getProperty("java.version"));  //system: jvm 
      System.out.println(sysProp.getProperty("user.language"));
      sysProp.list(System.out);

   }
}