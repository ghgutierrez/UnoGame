
public class UnoGame {
	static UnoGame theGame = null;
// define the private variables here 
	private Deck deck;
	private Player[] players;
	
	private UnoGame() { // private constructor can't be accessed outside the class

		deck = new Deck();

		for (int i = 0; i < 16; i++) {
			for (int c = 0; c < 4; c++) {
				if (i < 10) {

					if (c == 0)
						deck.addCard(new Card(i + "", "red"));
					if (c == 1)
						deck.addCard(new Card(i + "", "green"));
					if (c == 2)
						deck.addCard(new Card(i + "", "yellow"));
					if (c == 3)
						deck.addCard(new Card(i + "", "blue"));

				}

				if (i == 11) {

					if (c == 0)
						deck.addCard(new Card("reverse", "red"));
					if (c == 1)
						deck.addCard(new Card("reverse", "green"));
					if (c == 2)
						deck.addCard(new Card("reverse", "yellow"));
					if (c == 3)
						deck.addCard(new Card("reverse", "blue"));

				}

				if (i == 12) {

					if (c == 0)
						deck.addCard(new Card("skip", "red"));
					if (c == 1)
						deck.addCard(new Card("skip", "green"));
					if (c == 2)
						deck.addCard(new Card("skip", "yellow"));
					if (c == 3)
						deck.addCard(new Card("skip", "blue"));

				}

				if (i == 13) {

					if (c == 0)
						deck.addCard(new Card("+2", "red"));
					if (c == 1)
						deck.addCard(new Card("+2", "green"));
					if (c == 2)
						deck.addCard(new Card("+2", "yellow"));
					if (c == 3)
						deck.addCard(new Card("+2", "blue"));

				}

				if (i == 14) {

					if (c == 0)
						deck.addCard(new Card("wild", "red"));
					if (c == 1)
						deck.addCard(new Card("wild", "green"));
					if (c == 2)
						deck.addCard(new Card("wild", "yellow"));
					if (c == 3)
						deck.addCard(new Card("wild", "blue"));

				}

				if (i == 15) {

					if (c == 0)
						deck.addCard(new Card("wild +4", "red"));
					if (c == 1)
						deck.addCard(new Card("wild +4", "green"));
					if (c == 2)
						deck.addCard(new Card("wild +4", "yellow"));
					if (c == 3)
						deck.addCard(new Card("wild +4", "blue"));

				}
			}

		}

//creates the players (4)
		players = new Player[4];
		
	//deals 7 cards to the players
		for(int i = 0; i < 4; i++) {
			players[i].draw(deck.deal());
			players[i].draw(deck.deal());
			players[i].draw(deck.deal());
			players[i].draw(deck.deal());
			players[i].draw(deck.deal());
			players[i].draw(deck.deal());
			players[i].draw(deck.deal());
			
			
		}
			
		
		
// 4. think about other tasks to complete before game can start

		System.out.println("Constructing the driver program singleton.");
	}

	static public UnoGame getGame() // Public method to create the instance
	{
		if (theGame == null)
			theGame = new UnoGame();
		return theGame;
	}

	public void play() {
// Need to: create a loop that allows the program to simulate playing the players hands. Loop ends
// when player says "UNO"

		System.out.println("Playing the game.");
	}

}