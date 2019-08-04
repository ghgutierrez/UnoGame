import java.util.ArrayList;
import java.util.Collections;


public class Deck {
	private int size;
	private ArrayList<Card> deck;
	
	public Deck() {
		size = 0;
		deck = new ArrayList<Card>();
		
	}
	
	public void addCard(Card c) {
		deck.add(c);
		
		
	}
	//shuffle
	public void shuffle() {
		Collections.shuffle(deck);
		
	}
	
	public Card deal() {
		if(deck.size() > 0)
			return deck.remove(0);
		return null;
		
		
	}
	

	public int getValue() {
		return size;
	}

	public void setValue(int value) {
		this.size = value;
	}

	public ArrayList<Card> getDeck() {
		return deck;
	}

	public void setDeck(ArrayList<Card> deck) {
		this.deck = deck;
	}
	

}
