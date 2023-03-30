package ch04;
public class AnimalTest {
	public static void main(String[] args) {
		/*Animal a1 = new Animal();
		a1.setName("lion");
		a1.setAge(4);		
		Animal a2 = new Animal();
		a2.setName("bear");
		a2.setAge(8);*/	
		Human hong = new Human();
	}
}
class Human extends Animal {
		String hobby;
		String job;
		void work() {   }  
		void cry()  {   }    
		void laugh() {    }	
		public void eat(String food) {
			   System.out.println(food + "을 식기로 먹어요");	
		}
}	
class Animal{                      //클래스 선언이유: 동물들의 공통된 특성을 가지고 Animal class 선언. 
	private String name;
	private int age;
	public void eat(String food) {
	   System.out.println(food + "를 먹어요");	
	}
}
	
	/*public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age= age;
	}		
}*/
class Durumi extends Animal {
	public void eat(String food) {
		   System.out.println(food + "를 부리로 먹어요");	
		}
	
}
class Fox extends Animal {
	public void eat(String food) {
		   System.out.println(food + "를 주둥이로 먹어요");	
		}
}
class Lion extends Animal {         //상속관계 정의. 사자는 동물에 상속됨.
	public String hunting() {
		String s = "rabbit";        //자식 클래스를 보면 부모를 알수있음.
		return s;
	}	
}

