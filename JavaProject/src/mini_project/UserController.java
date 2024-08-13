package mini_project;

public class UserController {
	//Controller(접근객체) : Book배열을 가지고있어 접근하여 각 기능을 수행해주는 객체
	UserSave us = new UserSave();
	
	
	
	//회원추가
	//리턴값 0 = 성공, 1 = 아이디 닉네임 중복, 2 = 아이디 중복, 3 = 닉네임
	public int userAdd(String id, String password, String nickname) {
		String[] checkNickName = us.nickNameRead();
		boolean cid;
		boolean cnn;
		
		//지금까지 회원가입된 아이디와 닉네임들을 전부 읽어와서 아이디가 중복되었는지 닉네임이 중복되었는지 숫자로 리턴
		if(us.userRead(id) != null && us.userRead(id).getNickName().equals(nickname)) {
			cid = false;
			cnn = false;
			return 1;
		}
		else if(us.userRead(id) != null) {
			for(int i = 0; i < checkNickName.length; i++) {
				System.out.println(i);
				System.out.println(checkNickName);
				if(checkNickName[i] == nickname) return 3;
			}
		}
		else if(us.userRead(id) != null) return 2;
		//닉네임이 겹치는건 새로운 배열이나 세트를 추가해서 모든 데이터 값을 읽고 겹치는게 있으면 return 3;
		else {
			us.userSave(id, password, nickname);
			us.nickNameSave(nickname);
			return 0;
		}
		return 999;
	}
	
	
	
	public String logIn(String id, String pw) {
		String ret = null;
		if(us.userRead(id).getId().equals(id) && us.userRead(id).getPassword().equals(pw)) {
			User user = us.userRead(id);
			ret = user.getNickName();
		}
		return ret;
	}
}
