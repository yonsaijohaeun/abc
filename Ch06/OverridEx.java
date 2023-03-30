package Ch06;
class Weapon{
    protected int fire() {
    	return 1;
    }	
}
class Cannon extends Weapon {
	protected int fire() {
		return 10;
	}
	
}
public class OverridEx {
	public static void main(String[] args) {
		Weapon weapon;
		weapon = new Weapon();
		System.out.println("무기:"+weapon.fire());
		weapon = new Cannon();
		System.out.println("대포:"+weapon.fire());
	}

}
