package Ch11;

import java.util.*;

public class TreeSetEex1 {

	public static void main(String[] args) {
		TreeSet ts = new TreeSet();
		int[] score = {80,75,92,45,100,10,65,35,50};
	    for(int i=0; i<score.length; i++) 
	    	ts.add(score[i]);   //score의 요소들을 하나씩 집어넣음
	    System.out.println(ts);
	    System.out.println("50보다 작은 값 : "+ ts.headSet(50));
	    System.out.println("50보다 큰 값 : "+ ts.tailSet(50));  //50이 포함됨

	}

}
