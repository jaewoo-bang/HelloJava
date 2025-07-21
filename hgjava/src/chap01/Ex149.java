package chap01;

import java.util.Scanner;

public class Ex149 {

	public static void main(String[] args) {
		// p149 문제1
		// 이유 주석으로 표시 , 오류수정
		byte b = 5;
		b = (byte)-b;
		int result = 10 / b;
		System.out.println(result);
		// -b는 int 타입이기때문에 강제 타입변환으로 byte로 바꿔야함
		
		// 문제2
		int x = 10;
		int y = 20;
		int z = (++x) + (y--);
		System.out.println(z);
		
		//문제4 
		int pencils = 534;
		int students = 30;
		//학생 1명이 가지는 연필개수
		int pencilsPerStudent = pencils / students;
		System.out.println("나눠준 개수 =" + pencilsPerStudent);
		//남은 연필 개수
		int pencilsLeft = pencils % students;
		System.out.println("남은 연필개수 =" + pencilsLeft);
		
		//문제5
		int var1 = 5;
		int var2 = 2;
		double var3 = (double)var1 / var2;
		int var4 =(int) (var3 * var2);
		System.out.println(var4);
		
		//문제6
		int value = 356;
		System.out.println(value/100 *100);
		
		//문제7 
		float num1 = 10f;
		float num2 = num1 / 100;
		if(num2 != 0.1) {
			System.out.println("10%입니다.");
		} else { 
			System.out.println("10%가 아닙니다");
		}
		
		//문제8
		int lengthTop = 5;
		int lengthBottom = 10;
		int height = 7;
		double area = (double)(lengthTop + lengthBottom) *height / 2;
		System.out.println(area);
		
		//문제9
		Scanner sc = new Scanner(System.in);
		System.out.println("첫 번째 수: ");
			
		//윤년구하기
		
		Scanner sc = new Scanner(System.in);
		System.out.print("##년도: ");
		
		
		int year = Integer.parseInt(sc.nextLine());
		if(year % 4 == 0 && (year % 400 == 0 || year % 100 != 0)) {
//			if(year % 400 == 0 || year % 100 != 0) {
				System.out.println(year + "년 윤년");
//			}else {
//				System.out.println(year + "년 평년");
//			}
		}else {
			System.out.println(year + "년 평년");				
		}
	}			
		
		
		
	 

}
