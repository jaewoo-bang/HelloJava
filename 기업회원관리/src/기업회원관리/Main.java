package 기업회원관리;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		boolean run =true;
		Scanner scn = new Scanner(System.in);
		MembersDAO dao = new MembersDAO();
		while(run) {
			System.out.println("===기업 회원 관리 시스템===");
			System.out.println("1.회원가입");
			System.out.println("2.회원 로그인");
			System.out.println("3.직원 정보 조회");
			System.out.println("4.회원 정보 수정");
			System.out.printf("선택> ");
			int menu = scn.nextInt(); scn.nextLine();
			switch(menu) {
			case 1:
				System.out.print("직원 아이디> ");
				int id = scn.nextInt(); scn.nextLine();
				
				System.out.print("아이디> ");
				String username = scn.nextLine();
				
				System.out.print("비밀번호> ");
				String password = scn.nextLine();
				
				System.out.print("이름> ");
				String name = scn.nextLine();
				
				System.out.print("이메일> ");
				String email = scn.nextLine();
				
				System.out.print("부서번호> ");
				String dept_no = scn.nextLine();
				
				System.out.print("부서> ");
				String dept_name = scn.nextLine();
				
				System.out.print("직급> ");
				String position = scn.nextLine();
				
				System.out.println("회원가입이 완료되었습니다");
			
				Members member = new Members(id, username, password, name, email, dept_no, dept_name, position);
				if(dao.insert(member)) {
					System.out.println("정상 등록");
				}else {
					System.out.println("등록 중 오류");
				}break;
			case 2:
				System.out.print("아이디: ");
				String username2 = scn.nextLine(); 
				System.out.print("비밀번호: ");
				String password2 = scn.nextLine();
				
				MembersDAO dao2 = new MembersDAO();
				Members member2 = dao.login(username2,password2);
				
				if (member2 != null) {
					System.out.println("로그인 성공! 환영합니다" + member2.getName() + "님");
				}else {
					System.out.println("로그인 실패: 아이디 또는 비밀번호를 확인하세요.");
				}break;
			case 3:
				 ArrayList<Members> list = new ArrayList<>();
				 
			}
			
			
			
			
		}//end while

	}//end main

}//end class
