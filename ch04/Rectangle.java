package ch04;

import java.util.Scanner;

public class Rectangle {
	    int width;
		int height;
		public int gerArea() {return width*height;}
		public static void main(String[] args) {
			Rectangle rect = new Rectangle();
			Scanner s = new Scanner(System.in);
			System.out.print("가로 세로>>");
			rect.width = s.nextInt();
			rect.height = s.nextInt();
			System.err.println("사각형의 면적은 "+rect.gerArea());
			s.close();
		}
		
		
	}


