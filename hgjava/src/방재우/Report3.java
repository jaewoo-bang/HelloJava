package 방재우;

import java.util.Scanner;

public class Report3 {

	public static void main(String[] args) {
		// 숫자 추측 게임
		Scanner sc = new Scanner(System.in);
		int su = (int)(Math.random() * 100) + 1;
		
		while(true) {
			System.out.print("숫자 입력 : ");
			int my = Integer.parseInt(sc.nextLine());
			
			if(su > my) {
				System.out.println("up하세요!!");
			}else if(su < my) {
				System.out.println("down하세요!!");
			}else {
				System.out.println("축하합니다!!");
			}
			sc.close();
			
			
		}

	}

}
