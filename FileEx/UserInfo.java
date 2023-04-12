package FileEx;

public class UserInfo implements java.io.Serializable{  //직렬화 가능한 클래스
	String name;
	String password;
	int age;
	public UserInfo() {
		this("Unknown","11111",0);
	}
	public UserInfo(String name, String password, int age) {
		this.name = name;
		this.password = password;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "("+name + ","+password + "," + age + ")";
	}
	
	

}
