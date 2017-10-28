
import java.security.SecureRandom;
import java.util.*;
public class DeckOfCards {
	private ArrayList<Card> deck = new ArrayList<Card>();
	private static final int numberOfCards = 52;
	private static SecureRandom randomNumber = new SecureRandom();
	private int currenCard;
	private static HashMap<String,Integer> cardsMap = new HashMap<String,Integer>();
	
	
	public DeckOfCards(){
		currenCard = 0;
		String[] faces = {"Ace", "Two", "Tree", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
		String[] suits = {"Hears", "Diamonds", "Clubs", "Spades"};
		cardsMap.put("Two", 2);
		cardsMap.put("Tree", 3);
		cardsMap.put("Four", 4);
		cardsMap.put("Five", 5);
		cardsMap.put("Six", 6);
		cardsMap.put("Seven", 7);
		cardsMap.put("Eight", 8);
		cardsMap.put("Nine", 9);
		cardsMap.put("Ten", 10);
		cardsMap.put("Jack", 10);
		cardsMap.put("Queen", 10);
		cardsMap.put("King", 10);
		cardsMap.put("Ace", 11);
		for(int i = 0 ; i < numberOfCards ; i++){
			deck.add(new Card(faces[i%13],suits[i/13]));
		}
		
	}
	
	public void shuffle(){
		currenCard = 0;
		for(int first = 0 ; first < deck.size() ; first++){
			int second = randomNumber.nextInt(numberOfCards);
			Card temp = deck.get(first);
			deck.set(first,deck.get(second));
			deck.set(second,temp);
			
		}
	}
	
	public Card dealCard(){
		if(currenCard < deck.size()){
			return deck.get(currenCard++);
		}
		else{
			return null;
		}
	}
	
	public static int getCardValue(String face){
		return cardsMap.get(face);
	}
	
	
}
