package March0330;
interface Repairable{}
class Unit{
	int hitPoint;
	final int MAX_HP;
	Unit(int hp){
		MAX_HP = hp;
	} 
}	
class GroundUnit extends Unit{   //add 생성자 선택
	GroundUnit(int hp) {
		super(hp);
	}
	
}
class AirUnit extends Unit{   //add 생성자 선택
	AirUnit(int hp) {
		super(hp);
	}
	
}
class Tank extends GroundUnit implements Repairable{ 
	Tank() {
		super(150);
		hitPoint = MAX_HP;	
	}
	public String toString() {
		return "Tank";
	}
	
}
class SCV extends GroundUnit implements Repairable{ 
	SCV() {
		super(40);
		hitPoint = MAX_HP;	
	}
    void repair(Repairable r) {
    	if(r instanceof Unit) {
    		Unit n = (Unit)r;
    		while(n.hitPoint != n.MAX_HP) {
    			n.hitPoint++;
    		}
    		System.out.println(n+"의 수리가 끝났습니다.");
    	}    	
	}
	
	public String toString() {    //toString 메소드 오버로딩
		return "SCV";
	}
    
}
class Marine extends GroundUnit {
	Marine() {
		super(100);
		hitPoint = MAX_HP;
	}
	
}
public class RepairEx {
	public static void main(String[] args) {
		Tank tank = new Tank();
		Marine marin = new Marine();
		SCV scv = new SCV();
	    scv.repair(tank);
	    scv.repair(scv);
	    System.out.println(scv.MAX_HP);;
	    System.out.println(tank.MAX_HP);;

	}

}
