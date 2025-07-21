package 방재우;

public class Report4 {

	public static void main(String[] args) {
		//4. 구구단 프로그램
		for(int dan= 2; dan<=9; dan++) {
			System.out.print("    " + dan + "단\t\t");
		}
		System.out.println();
		
		for(int gob = 1; gob<=9; gob++) {
			
			for(int	dan =2; dan<=9; dan++) {
				System.out.printf("%d x %d = %d\t " ,dan, gob, dan*gob);
			}
			System.out.println();
			
		}
		
		
	}//end main
}//end class
