package chap05;

import java.util.Scanner;

public class Ex223 {

	public static void main(String[] args) {
		// p223 문제6
		boolean run = true;
		int studentNum = 0;
		int[] scores = new int[] {
				
		};
		Scanner sc = new Scanner(System.in);
		
		while(run) {
			System.out.println("----------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("----------------------------------------------");
			System.out.print("선택> ");
			
			int selectNo = Integer.parseInt(sc.nextLine());
		
		// switch문 이용
		switch(selectNo) {
		case 1 :
			//학생 수 받아서 => 배열 크기 잡아줌
			System.out.print("학생수> " ); // 메뉴 1~5 선택
			studentNum = Integer.parseInt(sc.nextLine());
			scores = new int[studentNum]; // 배열크기 잡아줌
			break;
		case 2 :
			//학생 점수 배열에 입력
			for(int i=0; i<studentNum; i++) {
				System.out.printf("scores[%d]> ", i);
				scores[i] = Integer.parseInt(sc.nextLine());
			}
			break;
		case 3 :
			//학생 점수 출력
			for(int i=0; i<studentNum; i++) {
				System.out.printf("scores[%d]> %d\n", i , scores[i]);
			}
			break;
		case 4 :
			// 배열의 평균과 최대값 계산
			int sum = 0; //합
			int max = 0; //최대값
			for( int score : scores) {
				sum += score;
				if(max < score) max = score;
				}
			double avg = (double) sum / scores.length;
			System.out.println("최고 점수 : " + max);
			System.out.println("평균 점수 : " + avg);
			break;
		case 5 :
			run = false;
			break;
		default :
			System.out.println("잘못 선택함");
			}	
		}
		System.out.println("프로그램 종료");

	}//end main

}//end class
