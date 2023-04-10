package March0330;
public class Ex8_7 {
	public static void main(String[] args) {
		try {
			startInstall();
			copyFiles();
		} catch (SpaceException e) {
			System.out.println("에러메세지 : "+e.getMessage());
			e.printStackTrace();
			System.out.println("공간을 확보한 후 설치요망");
		} catch ( MemoryException e) {
			System.out.println("에러메세지 : "+e.getMessage());
			e.printStackTrace();
			System.out.println("다시 설치하세요");
		} finally {
			deleteTempFiles();
		} 

	}
	static void startInstall() throws SpaceException, MemoryException{
		if(!enoughSpace()) //enoughSpace의 결과가 부족하면 false
			throw new SpaceException("SpaceException");
		if(enoughMemory())	
			throw new MemoryException("MemoryException");
	}
	static void copyFiles() {}
	static void deleteTempFiles() {}
	
	static boolean enoughSpace() {
		return true;  //임의의값 
	}
	static boolean enoughMemory() {
		return true;
	}

}
class SpaceException extends Exception{
	public SpaceException(String message) {
		super(message);
		
	}
	
}
class MemoryException extends Exception{
	public MemoryException(String message) {
		super(message);
		
	}
	
}