
/**
 *  Deck represents a deck of playing cards and contains 52 regular cards.
 */
public class Deck {

    private Card[] deck;  // an array of 52 cards.  
    private int number;  //the number of cards that have been dealt from the deck

    /**
     * Constructs a regular 52-card poker deck.  Initially, the cards
     * are in a sorted order.  
     */
    public Deck() {
        deck = new Card[52];
        int CardCount = 0;
        for(int color = 0; color <= 3; color++) {
            for(int value = 1; value <= 13; value++) {
            deck[CardCount] = new Card(value, color);
            CardCount++;
            }
        }
        number = 0;
 }


    /**
     * Put all the used cards back into the deck (if any), and
     * shuffle the deck into a random order.
     */
    public void shuffle() {
        for(int i = 0; i < deck.length - 1; i++) {
            int rand = (int)(Math.random()*(i+1));
            deck[rand] = deck[i];
        }
        number = 0;
    }

    /**
     * Returns the number of cards left in the deck.  
     */
    public int numberLeft() {
        return deck.length;
    }

    /**
     * Removes the next card from the deck and return it.  It is illegal
     * to call this method if there are no more cards in the deck.  You can
     * check the number of cards remaining by calling the numberLeft() function.
     * @return the card which is removed from the deck.
     * @throws IllegalStateException if there are no cards left in the deck
     */
    public Card take() {
        if(deck.length == number) {
            throw new IllegalStateException("No more cards left in the deck.");}
        number++;
        return deck[number - 1];
    }
} // end class Deck
