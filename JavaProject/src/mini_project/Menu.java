package mini_project;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
	private Scanner sc = new Scanner(System.in);
	private UserController uc = new UserController();
	
	
	
	//Menu(입출력객체) : 사용자로부터 입력과출력을 받아 Controller의 각 기능을 활용하는 객체
	// 안내문자
	// 아이디와 비밀번호를 입력받아 일치하면 게임선택 화면으로 넘어감
	// 게임에서 이기면 입력된 아이디의 승패가 누적됨
	public void loginMenu() {
		int menu = 0;
		while(menu != 9) {
			try {
				System.out.println("게임대전에 오신것을 환영합니다.");
				System.out.println("1. 기존회원");
				System.out.println("2. 새 회원");
				System.out.println("9. 게임종료\n");
				System.out.print("선택 메뉴 : ");
				menu = sc.nextInt();
				sc.nextLine();
				
				switch(menu) {
				case 2:
					this.userAdd();
					break;
				case 1:
					if(this.logIn()) this.gameMenu();
				case 9:
					System.out.println("프로그램을 종료합니다.");
					break;
				default:
					System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
				}
			}
			catch(InputMismatchException e){
				System.out.println("숫자만 입력해주세요.");
				sc.nextLine();
			}
		}
	}
	
	
	
	public void gameMenu() {
		
	}
	
	
	
	// 유저 등록
	// 이름, 아이디, 비밀번호를 입력받음
	public void userAdd() {
		int add = -1;
		String id = null;
		String password = null;
		String nickName = null;
		while(add != 0) {
			if(add == -1) {
				System.out.print("아이디 : ");
				id = sc.next();
				System.out.print("비밀번호 : ");
				password = sc.next();
				System.out.print("닉네임 : ");
				nickName = sc.next();
				add = uc.userAdd(id, password, nickName);
			}
			else if(add == 1) {
				sc.nextLine();
				System.out.println("이미 사용중인 아이디입니다.");
				System.out.println("이미 사용중인 닉네임입니다.");
				System.out.println("다른 아이디, 닉네임을 입력하세요.");
				System.out.print("아이디 : ");
				id = sc.nextLine();
				System.out.print("비밀번호 : ");
				password = sc.next();
				System.out.print("닉네임 : ");
				nickName = sc.next();
				add = uc.userAdd(id, password, nickName);
			}
			else if(add == 2) {
				sc.nextLine();
				System.out.println("이미 사용중인 아이디입니다.");
				System.out.println("다른 아이디를 입력하세요.");
				System.out.print("아이디 : ");
				id = sc.next();
				System.out.print("비밀번호 : ");
				password = sc.next();
				System.out.print("닉네임 : ");
				nickName = sc.next();
				add = uc.userAdd(id, password, nickName);
			}
			else if(add == 3) {
				sc.nextLine();
				System.out.println("이미 사용중인 닉네임입니다.");
				System.out.println("다른 닉네임을 입력하세요.");
				System.out.print("아이디 : ");
				id = sc.next();
				System.out.print("비밀번호 : ");
				password = sc.next();
				System.out.print("닉네임 : ");
				nickName = sc.next();
				add = uc.userAdd(id, password, nickName);
			}
			else if(add == 999) {
				System.out.println("uc.userAdd error");
			}
			if(add == 0) {
				System.out.printf("%s님 새로운 회원이되신것을 환영합니다.\n", nickName);
				System.out.println();
			}
		}
	}
	
	
	
	//유저 삭제
	//?? 어케함
	public void userDelete() {
		
	}
	
	
	
	//아이디와 비밀번호를 받아서 uc.logIn으로 보내서 닉네임을 반환받음
	public boolean logIn() {
		for(int i = 0; i < 5; i++) {
			System.out.print("아이디 : ");
			String id = sc.next();
			System.out.print("비밀번호 : ");
			String pw = sc.next();
			String login = uc.logIn(id, pw);
			if(login != null) {
				System.out.printf("%s님 환영합니다.\n", login);
				return true;
			}
			else {
				System.out.println("아이디나 비밀번호가 일치하지 않습니다.");
				System.out.println("로그인 5회 실패 시 프로그램이 종료됩니다.\n");
			}
		}
		return false;
	}
	
	
	
	//게임이 끝나면 ~~~게임 ㅇㅇㅇ vs xxx ㅇㅇㅇ승 이런 형식으로 메모장에 저장
	public void gameRecord() {
		
	}
	
	
	
	// 1. 유저 이름으로 게임기록 검색
	// 1-1. 유저간 대결기록 총 00게임중 00승 00패
	// 2. 전체 게임기록 검색
	// 3. 게임별로 기록검색
	public void search() {
		
	}
	
	
	
	//대전기록 전체 출력
	public void searchAll() {
		
	}
	
	
	
	//랭킹표
	public void rank() {
		
	}
	
	
	
	//게임설명
	public void gameRule() {
		
	}
}
