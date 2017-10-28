
import javax.swing.JOptionPane;
public class Game {
	private DeckOfCards deckOfCards;
	private Player computer;
	private Player user;
	private Boolean endGame;
	private static final int maxValue = 21;
	private static final int computerStopLimit = 17;

	public Game(Player computer, Player user ){
		deckOfCards = new DeckOfCards(); 
		this.computer = new Player();
		this.user = new Player();
		endGame = false;
	}

	public void startGame(){
		deckOfCards.shuffle();
		computer.insertCard(deckOfCards.dealCard());
		user.insertCard(deckOfCards.dealCard());
		computer.insertCard(deckOfCards.dealCard());
		user.insertCard(deckOfCards.dealCard());

		Boolean stopDealing = false;
		while(!endGame){
			while(computer.sumCards() < computerStopLimit){
				computer.insertCard(deckOfCards.dealCard());
			}

			while(!stopDealing){
				int input = JOptionPane.showConfirmDialog(null, "Your current cards: "+ user.toString() +" ,would you like another card?");
				if(input == 0){
					user.insertCard(deckOfCards.dealCard());
				}
				if(input == 1){
					
					if(user.sumCards() > computer.sumCards() && user.sumCards() <= maxValue){
						int j =	JOptionPane.showConfirmDialog(null, "Your current cards: "+ user.toString() 
								+" Computer's cards: " + computer.toString() + " , "+
								"you are the winner!","Click ok",JOptionPane.DEFAULT_OPTION);
						
					}
					
					if(user.sumCards() < computer.sumCards() && computer.sumCards() <= maxValue){
						int j =	JOptionPane.showConfirmDialog(null, "Your current cards: "+ user.toString() 
								+" Computer's cards: " + computer.toString() + " , "+
								"computer is the winner!","Click ok",JOptionPane.DEFAULT_OPTION);
					}
					if(user.sumCards() > maxValue && computer.sumCards() > maxValue || user.sumCards() == computer.sumCards()){
						int j =	JOptionPane.showConfirmDialog(null, "Your current cards: "+ user.toString() 
								+" Computer's cards: " + computer.toString() + " , "+
								"it is a drow!","Click ok",JOptionPane.DEFAULT_OPTION);
						
					}
					stopDealing = true;
					endGame = true;
				}
				
				if(input == 2){
					stopDealing = true;
					endGame = true;
				}


			}
		}

	}
}
