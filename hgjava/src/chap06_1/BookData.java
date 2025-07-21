package chap06_1;

import java.util.Scanner;

public class BookData {
	//북 데이터 생성
	//필드
	//생성자: 기본생성자 => 컴파일 자동 생성
	//메소드
	Scanner sc = new Scanner(System.in);
	
	Book[] bkdata(int n) {
		Book[] books = new Book[n];
		
		for(int i=0; i<n; i++) {
			System.out.printf("%d 번째 도서 정보 입력\n" , i+1);
			
			System.out.printf("도서번호 > ");
			int bookNum = Integer.parseInt(sc.nextLine());
			
			System.out.printf("도서제목 > ");
			String bookNm = sc.nextLine();
			
			System.out.printf("도서가격 > ");
			int price = Integer.parseInt(sc.nextLine());
			
			books[i] = new Book(bookNum ,bookNm , price);
		}
		return books;
	}
	
	
}//end class
