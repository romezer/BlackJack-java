import java.util.ArrayList;


public class Player {
	private static final int maxValue = 21;
	private ArrayList<Card> deck;
	
	public Player(){
		deck = new ArrayList<Card>();
	} 
	
	public void insertCard(Card c){
		deck.add(c);
	}
	
	public int sumCards(){
		int sum = 0;
		int aceCounter = 0;
		for(int i = 0 ; i < deck.size() ; i++){
			sum = sum + DeckOfCards.getCardValue(deck.get(i).getFace());
			if((deck.get(i).getFace() == "Ace")){
				aceCounter =+1;
			}
		}
		if(sum > maxValue && aceCounter >= 1 ){
			while(sum > maxValue && aceCounter >= 1){
				sum = sum - 10;
			}
		}
		return sum;
	}
	
	public String toString(){
		String s = "";
		for(int i = 0 ; i < deck.size() ; i++){
			s = s + deck.get(i).getFace() + " " + deck.get(i).getSuit()+ ", ";
		}
		return s;
	}
	

}
