package ch04;

import java.util.Scanner;

public class BookArray {
	public static void main(String[] args) {
		Book[] book = new Book[3];          //방 5개짜리 book 레퍼런스 생성
		System.out.println(book);
        Scanner s = new Scanner(System.in);
        for(int i=0; i<book.length; i++) {
            System.out.println("책 제목>> ");
        	String title = s.nextLine();
        	System.out.println("작자명>> ");
        	String author = s.nextLine();
        	book[i] = new Book(title,author);       //배열 원소 객체 생성
        }
        for(int i=0; i<book.length; i++) {
        	System.out.println("("+book[i].title+", "+book[i].author+")");
        }
	}

}
