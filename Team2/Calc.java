package Team;

public class Calc {
	
		private int x;
		private int y;
		private String s;
		
		public Calc(int x, int y, String s) {
			super();
			this.x = x;
			this.y = y;
			this.s = s;
		
		}
		public void calcOperation() {
			int x = this.x;
			int y = this.y;
			String s = this.s;
			switch(s) {
			case "+": 
				System.out.println(x+y);
			}
			switch(s) {
			case "-": 
				System.out.println(x-y);
			}
		}
		
		public int getX() {
			return x;
		}
		public void setX(int x) {
			this.x = x;
		}
		public int getY() {
			return y;
		}
		public void setY(int y) {
			this.y = y;
		}
		public String getS() {
			return s;
		}
		public void setS(String s) {
			this.s = s;
		}
		
		
}
