package chap06_1;

public class Book {
	//필드:field
	
	private int bookNum;
	private String bookNm;
	private int price;
	
	
	
	
	//생성자:constructor
	
	public int getBookNum() {
		return bookNum;
	}




	public String getBookNm() {
		return bookNm;
	}




	public int getPrice() {
		return price;
	}




	Book(int bookNum, String bookNm, int price) {
		
		this.bookNum = bookNum;
		this.bookNm = bookNm;
		this.price = price;
	}
	//메소드:method
	//도서 최고가격
	
	
}//end class
