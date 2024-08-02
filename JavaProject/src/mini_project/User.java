package mini_project;

public class User {
	//VO(저장객체) : Book과같은 실제 데이터를 가지고있는 객체
	//유저를 하나하나 file로 받아서 저장.
	private String id;
	private String password;
	private String nickName;
	
	
	
	public User() {
		super();
	}
	public User(String id, String password, String nickName) {
		super();
		this.id = id;
		this.password = password;
		this.nickName = nickName;
	}
	
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	
	
	
	@Override
	public String toString() {
		return "User [id=" + id + ", password=" + password + ", nickName=" + nickName + "]";
	}
}
