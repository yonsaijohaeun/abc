package Ch06;
public class DeckTest {
	public static void main(String[] args) {
	    Deck d = new Deck();
	    Card c = d.pick();	    
	    System.out.println(c);
	    //System.out.println(d.cardArr[3]); 
	    d.shuffle();
	    c = d.pick();
	    System.out.println(c); 
	    //System.out.println(d.cardArr[3]); 
	    
	}
}
class Deck{
	final int CARD_NUM = 52;  //카드수는 바뀌지 않으니까 final
	Card[] cardArr = new Card[CARD_NUM];
	public Deck() {
		int i = 0;	
		for(int k=Card.KIND_MAX; k>0; k--)
		   for(int n=0; n<Card.NUM_MAX; n++)
			   cardArr[i++] = new Card(k,n+1);     // k=kind, n=number
	}
	Card pick(int index) {
		return cardArr[index];     //몇 번 방에 있는 카드 뽑아줘
	}
	Card pick() {
	    int index = (int)(Math.random()*CARD_NUM);
	    return pick(index);
	}
	void shuffle() {
		for(int i=0; i<CARD_NUM; i++) {
			  int r = (int)(Math.random()*CARD_NUM);
			  Card temp = cardArr[i];
			  cardArr[i] = cardArr[r];
			  cardArr[r] = temp;
	    }
	}
}
class Card{
	static final int SPADE = 4;
	static final int DIAMOND = 3;
	static final int HEART = 2;
	static final int CLOVER = 1;
	static final int KIND_MAX = 4;
	static final int NUM_MAX = 13;
	int kind;
	int number;
	public Card() {       //디폴트 생성자
		//super();
		this(SPADE,1);
	}
	public Card(int kind, int number) {     //using field 생성자 
		//super();  없어도 있는 거임
		this.kind = kind;
		this.number = number;
	}
	@Override  //toString 메소드
	public String toString() {
		String[] kinds = {"","CLOVER","HEART","DIAMOND","SPADE"}; 
		String numbers = "0123456789XJQK";				
		return "[kind :" + kinds[this.kind] + ", number : " + numbers.charAt(this.number) + "]";
	}
}