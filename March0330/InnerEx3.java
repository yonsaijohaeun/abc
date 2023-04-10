package March0330;
public class InnerEx3 {
	private int outerIv = 0;
	static int outerCv = 0;
	class InstanceInner {
		int iiv = outerIv;
		int iiv2 = outerCv;				
	}
	static class StaticInner {
        InnerEx3 ie = new InnerEx3();
		int siv = ie.outerIv;
		static int scv = outerCv;
	}
	void myMethod() {
		int lv = 0;
		final int LV = 0; 		
		class LocalInner {
			int liv = outerIv;
			int liv2 = outerCv;
			int liv3 = lv;   //지역변수 . JDK 1.8부터 에러안남.
			int liv4 = LV;
		}
	}
	public static void main(String[] args) {
		

	}

}
