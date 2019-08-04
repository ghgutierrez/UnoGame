import java.util.ArrayList;

public class Player {
	
	private ArrayList<Card> hand;
		
	public Player() {
		hand = new ArrayList<Card>();
	
		
	}
	
	public ArrayList<Card> getHand(){
		return hand;
	}
	
	public void setHand(ArrayList<Card> hand) {
		this.hand = hand;
		
	}
	
	public void draw(Card c) {
		hand.add(c);
	}
	

}
