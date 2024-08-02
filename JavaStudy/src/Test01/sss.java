package Test01;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

//파일에 객체 정보를 저장하는 프로그램을 구현하려고 한다. 사용되는 Food 클래스를 [원인](30점)에 기술하고, 
//파일에 데이터로 기록 저장하는 코드를 [조치내용](20점)에 작성하시오. (총 50점)
//[클라이언트용 프로그래밍 실행 순서]
//[조치내용] : fileSave() 메소드를 작성하시오. : public void fileSave(String fileName){}
//- 전달받은 fileName 으로 파일 객체를 생성한다.
//- 파일 객체와 연결하는 파일 출력스트림을 생성한다.
//- 파일에 Food 객체를 기록할 수 있는 객체 출력스트림을 추가한다.
//- 파일에 Food 객체 정보를 기록하고 스트림들을 닫는다.
//- Food 객체 샘플 : "사과", 20
public class sss {
	public void fileSave(String fileName) {
		File f1 = new File(fileName);
		Food f = new Food("사과", 20);
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Food.txt"));) {
			oos.writeObject(f);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Food.txt"));) {
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
