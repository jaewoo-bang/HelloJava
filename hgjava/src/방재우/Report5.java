package 방재우;

import java.util.Scanner;

public class Report5 {

	public static void main(String[] args) {
		// 섭씨-화씨 온도 변환 프로그램
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		
		while(run) {
			System.out.println("----------------");
			System.out.println("1. 화씨 => 섭씨");
			System.out.println("2. 섭씨 => 화씨");
			System.out.println("3. 종료 ");
			System.out.println("--------------- "); 
			
			System.out.print("번호 선택 : ");
			int num = Integer.parseInt(sc.nextLine());
			
			switch(num) {
			case 1 :
				System.out.print("화씨 온도 입력 : ");
				double f = Double.parseDouble(sc.nextLine());
				double c = 5.0 / 9.0 * (f - 32);
				System.out.println("섭씨온도 = " + c);
				break;
			case 2 :
				System.out.print("섭씨 온도 입력 : ");
				c = Double.parseDouble(sc.nextLine());
				f = 9.0 / 5.0 * c + 32;
				System.out.println("화씨온도 = " + f);
				break;
			default : 
				System.out.println("program end");
				run = false;
			}
		}
				sc.close();
		 

	}

}
