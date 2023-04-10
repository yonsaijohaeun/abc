package Ch11;

class Person {
	String name;
	int age;
    public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
    
    //@Override
	public int hashCode() {
		return (name+age).hashCode();
	}

	public String toString() {
    	return name + ":" + age;
    }

	public boolean equals(Object obj) {
		if(!(obj instanceof Person)) return false;
		Person tmp = (Person) obj;		
		return name.equals(tmp.name) && age == tmp.age;
	}
	
    
    
}

    
	



