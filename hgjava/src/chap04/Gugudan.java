package chap04;

public class Gugudan {

	public static void main(String[] args) {
		// 구구단
		//단 반복
		for(int dan = 2; dan <= 9; dan++) {
			System.out.println("****" + dan + "****");
			for(int gob = 1; gob <=9; gob++) {
				System.out.printf("%d x %d = %d\n",dan, gob, dan * gob);
			}
		}
		System.out.println();
		
		// 구구단2
		
		//별찍기
		for(int i=1; i<=4; i++) { //줄수
			for(int l=1; l<=i; l++) {	//별수
				System.out.print("*");
			}	
			System.out.println();
		}
		
		//문제3
		// 추가 : 몇 번만에 탈출했는지 출력
		// 횟수 체크 변수 선언
		int cnt = 0;
		// 반복문
		while(true) {
			// 주사위 2개 생성
			int dice3 = (int) (Math.random() * 6) + 1;
			int dice4 = (int) (Math.random() * 6) + 1;
			int sum = dice3 + dice4;
			// 순서쌍 출력
			System.out.printf("(%d , %d)\n" , dice3 , dice4);
			// 횟수 체크
			cnt++;
			// 합이 5가 되었는 지 체크 
			if(sum == 5) {
				break;
			}
			// 5면 탈출, 아니면 반복
		}
		// 반복 횟수 출력
		System.out.println("횟수 출력" + cnt);
		//문제4
		// 조건 : 0 < x <= 10, 0 < y <= 10
		// 4 * x + 5 * y = 60 이 되는 (x,y)
		 
		 for(int x = 1; x<=10; x++) { 
			 for(int y =1; y<=10; y++) {
				 int result = 4 * x + 5 * y;
				 if(result == 60 ) {
					 System.out.printf("(%d,%d)\n", x, y);
				 }
			 }
		 }
		 
		 //문제6
		 for(int i =1; i<=4; i++) {
			 for(int j =4; j>=1; j--) {
				 if(i < j) {
					 System.out.print(" ");
				 }else {
					 System.out.print("*");
				 }
			 }
			 System.out.println();
		 }
		 
		 
		
		
	}//end main

}//end class
