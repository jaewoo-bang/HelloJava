package 방재우;

import java.util.Scanner;

public class Report1 {

	public static void main(String[] args) {
		// 1.윤년계산
		// 년도를 입력할수 있게 출력
		Scanner sc = new Scanner(System.in);
		// 4로 나누어떨어지고, 100으로 나누어 떨어지지 않으면 윤년인 조건생성
		System.out.print("##년도 입력 :" );
		int year = Integer.parseInt(sc.nextLine());
		
		if( year % 4==0 && year % 100!=0 || year % 400 ==0) {
			System.out.printf(year + "년은 윤년입니다");
		}else {
			System.out.println(year + "년은 평년입니다");
		}
		
		// 400으로 나누어 떨어지면 윤년
		sc.close();
	}

}
