package mini_project;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class UserSave {
	
	public void userSave(String id, String password, String nickname) {
		User u = new User(id, password, nickname);
		try {
			File file = new File("C:\\workspace\\1_JAVA\\JavaProject\\"+ id);
			if(!file.exists()) {
				file.createNewFile();
			}
			
			FileWriter fw = new FileWriter(file);
			BufferedWriter bw = new BufferedWriter(fw);
			
			bw.write(id);
			bw.write(password);
			
			fw.close();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public void userRead(String id) {
		BufferedReader br = new BufferedReader("C:\\workspace\\1_JAVA\\JavaProject\\"+ id);
	}
}
