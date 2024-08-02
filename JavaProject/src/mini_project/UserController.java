package mini_project;

public class UserController {
	//Controller(접근객체) : Book배열을 가지고있어 접근하여 각 기능을 수행해주는 객체
	UserSave us = new UserSave();
	
	
	
	//회원추가
	//리턴값 0 = 성공, 1 = 아이디 중복, 2 = 닉네임 중복
	public int userAdd(String id, String password, String nickname) {
		us.userSave(id, password, nickname);
		return 0;
	}
	
	
	
	public String logIn(String id, String pw) {
		
		return null;
	}
}
