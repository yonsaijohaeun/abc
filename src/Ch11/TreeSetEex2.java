package Ch11;
import java.util.*;
public class TreeSetEex2 {
	public static void main(String[] args) {
		TreeSet ts = new TreeSet();
		String s1 = "b";
		String s2 = "d";
		ts.add("abc");         ts.add("alian");	         ts.add("bat");
		ts.add("car");         ts.add("Car");	         ts.add("cat");
		ts.add("dance");       ts.add("dasdg");	         ts.add("dZZZ");      ts.add("dzzz");
		ts.add("elephant");    ts.add("elevator");	     ts.add("fan");       ts.add("flower");
		System.out.println(ts);
		System.out.println("range search from "+s1+" to "+s2);
		System.out.println("set.subSet() :"+ts.subSet(s1, s2));  //'b'부터 'd'로 시작하는 전까지
		System.out.println("set.subSet() :"+ts.subSet(s1, s2+"zzz"));  //'b'부터 'dzzz' 전까지 
		
		
		
	}

}
