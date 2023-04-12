package FileEx;
import java.io.*;
class SuperUserInfo {
	String name;
	String password;
	SuperUserInfo() {
		this("Unknown", "1111");
	}
	public SuperUserInfo(String name, String password) {
		this.name = name;
		this.password = password;
	}
	
}
public class UserInfo2 extends SuperUserInfo implements java.io.Serializable {
	int age;
	public UserInfo2() {
		this("Unknown","1111",0);
	}
	public UserInfo2(String name, String password, int age) {
		super(name, password);
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "("+name + ","+password + "," + age + ")";
	}
	
	private void writeObject(ObjectOutputStream out)
		throws IOException {
		out.writeUTF(name);  //name의 타입이 string 이라 writeUTF
		out.writeUTF(password);
		out.defaultWriteObject();
	}
	
	private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
		name = in.readUTF();
		password = in.readUTF();
		in.defaultReadObject();
	}
}
