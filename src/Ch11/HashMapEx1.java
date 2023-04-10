package Ch11;
import java.util.*;
public class HashMapEx1 {
	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("myId", "1234");
		map.put("asdf", "1111");
		map.put("qwer", "1234");
		map.put("asdf", "1234");   //1234만 있음. 기존의 값을 덮어씌운다.
		System.out.println(map);
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.println("id와 password를 입력하세요.");
			System.out.print("id: ");
			String id = scan.next();
			System.out.print("password: ");
			String pw = scan.next();
			if(!map.containsKey(id)) {  //id 값이 키로 없으면
				System.out.println("해당 id가 존재하지 않습니다. 다시 입력하세요");
				continue; //while문 처음으로 돌아감.
			}else {
				if(!(map.get(id).equals(pw))) {
					System.out.println("password가 일치하지 않습니다. 다시 입력하세요");
					
				}else {
					System.out.println("id와 password가 일치합니다.");
					break;  //일치하면 while문 빠져나감.
				}
			}
		
		}

	}

}
