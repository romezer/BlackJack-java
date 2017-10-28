
public class Card {

	private final String face;
	private final String suit;

	public Card(String cardFace, String cardSuit){
		this.face = cardFace;
		this.suit = cardSuit;
	}
	
	public String getFace(){
		return this.face;
	}
	
	public String getSuit(){
		return this.suit;
	}

}
