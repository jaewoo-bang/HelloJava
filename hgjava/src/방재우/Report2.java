package 방재우;

import java.util.Scanner;

public class Report2 {

	public static void main(String[] args) {
		// 2.동전 교환 프로그램
		// 동전 입력 프로그램 생성
		Scanner sc = new Scanner(System.in);
		//500원,100원,50원,10원짜리 동전 변수생성
		System.out.print("##교환할 금액 : ");
		int money = Integer.parseInt(sc.nextLine());
		
		int share = money / 500;
		System.out.println("500원 짜리 : " + share);
		int remain = money % 500;
		
		share = remain / 100;
		System.out.println("100원 짜리 : " + share);
		remain = remain % 100;
		
		share = remain / 50;
		System.out.println("50원 짜리 : " + share);
		remain = remain % 50;
		
		share = remain / 10;
		System.out.println("10원 짜리 : " + share);
		remain = remain % 10;
		
		System.out.println("교환 금액 : " + (money - remain));
		System.out.println("남은 금액 : " + remain);
		
		sc.close();
		
		

	}

}
