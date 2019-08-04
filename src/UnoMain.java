
public class UnoMain {
	
public static void main(String[] args) {
/*
* The main function retrieves the UnoGame singleton and gets the game started.
*/
UnoGame game = UnoGame.getGame();
System.out.println("Retrieved the game singleton.");
game.play();
}
}