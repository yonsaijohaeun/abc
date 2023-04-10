package March0330;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
public class Ex8_10 {
	public static void main(String[] args) {
		try {
			File f = createFile(args[0]);
			System.out.println(f.getName()+"파일이 생성되었습니다.");
		} catch (Exception e) {
			System.out.println(e.getMessage()+"다시입력");;
		}		
    }
	static File createFile(String fileName) throws Exception { 
			if(fileName==null || fileName.equals("")) //공백검사 
				throw new Exception("파일이름이 적절하지 않습니다.");
	        File f = new File(fileName);
	        f.createNewFile();   //하드디스크에 파일 생성됨
	        return f;
		
    }
}
