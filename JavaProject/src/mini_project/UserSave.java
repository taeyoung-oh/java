package mini_project;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class UserSave {
	
	//uc.userAdd에서 값을 보내면 객체로 
	public void userSave(String id, String password, String nickname) {
		User u = new User(id, password, nickname);
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(id + ".txt"));) {
			oos.writeObject(u);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	//uc.login에서 요청받아서 객체를 넘겨줌
	public User userRead(String id) {
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(id + ".txt"));) {
			User user = (User)ois.readObject();
			return user;
		} catch (FileNotFoundException e) {
			return null;
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	//uc.userAdd에서 return 3을 하기위해 닉네임만 파일에 저장하는 메소드
	public void nickNameSave(String nickname) {
		try (BufferedWriter bw = new BufferedWriter(new FileWriter("nickname.txt", true));){
			bw.write(nickname);
			bw.newLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public String[] nickNameRead() {
		String ret[] = new String[100];
		String temp;
		try(BufferedReader br = new BufferedReader(new FileReader("nickname.txt"));) {
			int i = 0;
			while((temp = br.readLine()) != null) {
				if(temp != null) ret[i] = temp;
				else return ret;
				i++;
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		return ret;
	}
}
