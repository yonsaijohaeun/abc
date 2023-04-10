package March0331;
public class Ex09_1 {
	public static void main(String[] args) {
		Card c1 = new Card();
		Card c2 = null;
			 c2 = (Card)c1.clone();  
		System.out.println(c1.equals(c2));   //주소값 비교.false 
		System.out.println(c1);
		System.out.println(c2);
    }}
class Card implements Cloneable{
	String Kind;
	int number;
	public Card() {
		this("SPADE",1);
		
	}
	public Card(String kind, int number) {
		this.Kind = kind;
		this.number = number;
	}
	
	protected Object clone() {    
	    Object obj = null;
		Card c = (Card)obj;
		c = new Card (new String("SPADE"),this.number); //c객체 완성
		obj = c;
		return obj;
	    }
      	
}
