package chap05;

public class ExamArr {

	public static void main(String[] args) {
		// 배열 과제1
		// 배열생성 , 크기 10 데이터 1~100사이 난수
		int[] rans = new int[10];
		for(int i =0; i<rans.length; i++) {
			rans[i] = (int) (Math.random() * 100) + 1;
			System.out.printf("%d ", rans[i]);
		}
		
		// 배열의 값 출력
		// 배열의 합, 최대값, 최소값 출력
		int sum = 0;
		int max = rans[0];
		int min = rans[0];
		for(int i =0; i<rans.length; i++) {
			sum += rans[i];
			if(max < rans[i]) max = rans[i];
			if(min > rans[i]) min = rans[i];
		}
		System.out.println();
		System.out.printf("합=%d\n최대값=%d\n최소값=%d\n" ,sum, max, min);
		
		// 배열의 요소 중 4의 배수 출력,
		
		// 4의 배수 개수 출력
		
		//2차원 배열
		//배열 선언
		int [][] twoArr = {
				{80,90},
				{70, 60, 50}
		};
		//2차원 출력
		for(int i = 0; i<twoArr.length; i++) {
			for(int j=0; j< twoArr[i].length; j++) {
				System.out.printf("| %d ", twoArr[i][j]);
			}
			System.out.println();
		}
		
		//과제 2
		int[][] twoArr2 = {
				{1,2,3},
				{1,2},
				{1},
				{1,2,3}
		};
		
		for(int i =0; i<twoArr2.length; i++) {
			for(int j=0; j< twoArr2[i].length; j++) {
				System.out.printf(" %d ", twoArr2[i][j]);
			}
			System.out.println();
		}
		//배열의 방의 값이 정해져있다면 중괄호 열어서 값대입
		//방이 안정해져있다면 new int[]방 지정
		//과제3
		int[][] person = new int[3][10];
		int sum1 = 0;
		for(int i =0; i<person.length; i++) {
			for(int j=0; j<person[i].length; j++) {
			person[i][j] = (int) (Math.random() * 2);
			System.out.print(person[i][j] + " ");
			sum1 += person[i][j];
			}
			System.out.println();
		}
		System.out.printf("관객 수 :  %d\n" , sum1 );

	
		//과제4
		int[][] stdent = new int[3][5];
		int sum2;
		double avg = 0;
		
		for(int i=0; i<stdent.length; i++) {
			for(int j=0; j<stdent[i].length; j++) {
				stdent[i][j] = (int) (Math.random() * 51) + 50;
				System.out.print(stdent[i][j] + "\t");
				
				
			}
			System.out.println();
		}
		
		//평균
		for(int i=0; i<stdent.length; i++) {
			sum2 = 0;
			for(int j=0; j<stdent[i].length; j++) {
				sum2 += stdent[i][j];
				avg = sum2 / 5.0;
			}
			System.out.printf("%d번 학생 평균 = %.2f \n" , i+1 , avg);
		}
		
		//과제5
		String[] card; 
		card = new String[] {"Clubs, Diamonds, Hearts, Spades"};
		for(String i = Clubs; i<Spades; i++) {
			
		}
		
	}//end main
	
	private static int add(int[] is) {
		int sum = 0;
		for(int i=0; i<is.length; i++) {
			sum += is[i];
		}
		return sum;
	}//end add
	
}//end class
