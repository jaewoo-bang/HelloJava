package chap04;

public class Ex182 {

	public static void main(String[] args) {
		// p182 문제3
		//1에서 100까지 정수 중 3의 배수 합, 3의 배수의 개수
		int sum = 0;
		int count = 0;
				
		for(int i =1; i<=100; i++) {
			if(i % 3==0) {
				sum += i;	//sum = sum + i i값 조건에 만족을하면 sum + i값이 sum 값에 저장이됨
				count++;	//count = count + i i값에 
			}
		}
		System.out.println(sum);
		System.out.println(count);

	}

}
