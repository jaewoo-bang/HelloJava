package 방재우;

import java.util.Scanner;

public class Report6 {

	public static void main(String[] args) {
		// 가위,바위,보 게임 프로그램
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("## 가위(0) 바위(1) 보(2) : ");
			int com = (int) (Math.random() * 2) + 1;
			int my = Integer.parseInt(sc.nextLine());
			
			if(my > 2) {
				System.out.println("game over");
				break;
			}else if() { 
				System.out.printf("사람 %d, 컴 %d  비겼음\n" , my, com);
			}else if() {
				System.out.printf("사람 %d, 컴 %d 컴 승리\n" , my, com);
			}else {
				System.out.printf("사람 %d, 컴 %d 사람 승리\n" , my, com);
			}
		}
		
		 

	}//end main

}//end class
