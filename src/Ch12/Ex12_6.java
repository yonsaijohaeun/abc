package Ch12;
import java.util.*;

public class Ex12_6 {
	public static void main(String[] args) {
		Box3 box = null;  
		Box3<Object> objBox = null; 
		box = (Box3)objBox;
		objBox = (Box3<Object>)box;  
		String[] fArr = {"apple","orange","grape"};
		ArrayList fList = new ArrayList();
		for(int i=0; i<3; i++)
			fList.add(fArr[i]);
		Box3<? extends Object> wBox = new Box3<String>(fList);
		objBox = (Box3<Object>)wBox;
		objBox.add(fList);
		Box3<? extends Fruit2> box2 = null;
		Box3<Apple2> appleBox = (Box3<Apple2>) box2;
		appleBox.add();
	}
}
class Box3<T> { 
	public Box3(ArrayList<T> list) {
		this.list = list;
	}
	ArrayList<T> list = new ArrayList<T>();
	void add(T item) {list.add(item);}   
	T    get(int i)  {return list.get(i);}
//	ArrayList<T> getList() {
//		return
//	}
	int  size()      {return list.size();}
	public String toString() { return list.toString();}

}
