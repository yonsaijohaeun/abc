package March0330;
abstract class Player{
	int currentPos; //현재 play되고 있는 위치를 저장하는 변수
	Player() {
		//currentPos = 0;     자식:starPlayer, 자식이 여러개면 5행도 여러개 작성해야.
		currentPos = 5;
		System.out.print("A,");
		System.out.print("B,");
		System.out.print("C,");
	}
	abstract void play(int pos);
	abstract void stop();
	void play() {
		play(currentPos);
	}
}
class StarPlayer extends Player{   //'StarPlayer'선택하여 메소드 추가함 .
	
	void play(int pos) {
		System.out.println("StarPlayer.play("+pos+")");
	}
	void stop() {
		System.out.println("StarPlayer.stop()");
	}
	
}
class BadPlayer extends Player{   //'StarPlayer'선택하여 메소드 추가함 .
	
	void play(int pos) {
		System.out.println("BadPlayer.play("+pos+")");
	}
	void stop() {
		System.out.println("BadPlayer.stop()");
	}
	
}
class YellowPlayer extends Player{   //'StarPlayer'선택하여 메소드 추가함 .
	
	void play(int pos) {
		System.out.println("YellowPlayer.play("+pos+")");
	}
	void stop() {
		System.out.println("YellowPlayer.stop()");
	}
	
}
public class AbstractTest {
	public static void main(String[] args) {
		Player p1 = new StarPlayer();
		p1.play();    
		Player p2 = new BadPlayer();
		p2.play();  
		Player p3 = new YellowPlayer();
		p3.play();  
		
	}

}
