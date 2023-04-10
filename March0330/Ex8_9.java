package March0330;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
public class Ex8_9 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("파일이름을 입력");
		String str = s.next();
		File f = createFile(str);
		System.out.println(f.getName()+"파일이 생성되었습니다.");
		s.close();
    }
	static File createFile(String fileName) { //return 타입: File
		try {
			if(fileName==null || fileName.equals("")) //공백검사 
				throw new Exception("파일이름이 적절하지 않습니다.");
		} catch (Exception e) {
		    fileName = "unTitled.txt";    
		}finally {		
		    File f = new File(fileName); 
		    createNF(f);  
		    return f; 
		}
	}
	static void createNF(File f) {
	    try {	
			f.createNewFile();
	    } catch (IOException e) {
		    e.printStackTrace();
	    }
    }
}
