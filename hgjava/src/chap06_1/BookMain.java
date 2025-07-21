package chap06_1;

import java.util.Scanner;

public class BookMain {

	public static void main(String[] args) {
		boolean run = true;
		Book[] books = null;
		BookData bksto = new BookData();
		int bookNum = 0;
		Scanner sc = new Scanner(System.in);
			
		while(run) {
			System.out.println("------------------------------------------------------------");
			System.out.println("1.도서수 입력 2.도서정보 등록 3. 도서정보 전체조회 4.도서정보 분석 5.종료");
			System.out.println("------------------------------------------------------------");
			System.out.print("선택> ");
			
			int selectNo = Integer.parseInt(sc.nextLine());
			
			switch(selectNo) {
			case 1 :
				System.out.print("도서 수> ");
				bookNum = Integer.parseInt(sc.nextLine());
				break;
			case 2 :
				
				 books = bksto.bkdata(bookNum);
				 break;
			case 3 :
				for(int i = 0; i<books.length; i++) {
					System.out.printf("도서번호 : %d 가격 : %d원\n" , books[i].getBookNum() , books[i].getPrice());
				}
					break;
			case 4 :
				int max = 0;
				int min = 0;
				int sum = 0;
				for(int i = 0; i<books.length; i++) {
					sum += books[i].getPrice();
					if(max < books[i].getPrice()) max = books[i].getPrice();
					if(min > books[i].getPrice()) min = books[i].getPrice();
				}
				System.out.printf("최고 가격 : %d\n" , max);
				System.out.printf("최저 가격 : %d\n" , min);
				System.out.printf("평균 가격 : %f\n" , (double)sum/books.length);
				break;
			case 5 : 
				run = false;
				System.out.println("프로그램 종료");
				}//end swicth
			
			}//end while
		}//end main
			

	}//end class

