import javax.swing.JOptionPane;


public class Test {

	public static void main(String[] args) {
		int proceedGame = 0;
		while(proceedGame == 0){
			Player p1 = new Player();
			Player p2 = new Player();
			Game g = new Game(p1,p2);
			g.startGame();
			proceedGame =	JOptionPane.showConfirmDialog(null, "Would you like to start a  new game?");
			
				
			}
		}
	}



