/**
 *The Player class should be able to represent the set of cards a player has in hand.
 * The player class must allow to take a card from the deck and put it in the hand, 
 * count the points of the cards in hand...
 **/
import java.util.ArrayList;

public class Player {
     private ArrayList<Card>  hand;   // The cards in the plyaer's hand.
 
     /*Constructor*/
 Player(){
       hand = new ArrayList<>();
    }  
 
 /*Accessor*/
 public ArrayList<Card> getHand() {
        return hand;
    }
 
 /**
     * Remove all cards from the hand, leaving it empty.
  */
    public void clear() {
       hand.clear();
    }

    /**
     * Add a card to the hand.  It is added at the end of the current hand.
     * @param card the non-null card to be added.
     * @throws NullPointerException if the parameter card is null.
     */
    public void add(Card card) {
        if(card == null)
            throw new NullPointerException();
        hand.add(card);
    }

    /**
     * Remove a card from the hand, if present.
     * @param card the card to be removed.  If card is null or if the card is not in 
     * the hand, then nothing is done.
     */
    public void remove(Card card) {
        if(card!=null){
            for(int j=0;j<hand.size();j++){
                Card presenter = (Card)hand.get(j);
                if(presenter.getValue() == card.getValue() && presenter.getColor() == card.getColor()){
                    hand.remove(j);
                    break;
                }
            }
        }
    }

    /**
     * Remove the card in a specified position from the hand.
     * @param position the position of the card that is to be removed, where
     * positions are numbered starting from zero.
     * @throws IllegalArgumentException if the position does not exist in
     * the hand, that is if the position is less than 0 or greater than
     * or equal to the number of cards in the hand.
     */
    public void remove(int position) {
        if(position >=0 && position < hand.size())
        hand.remove(position);
        else
        throw new IllegalArgumentException();
    }

    /**
     * Returns the number of cards in the hand.
     */
    public int totalCards() {
        return hand.size();
    }

    /**
     * Gets the card in a specified position in the hand.  (Note that this card
     * is not removed from the hand!)
     * @param position the position of the card that is to be returned
     * @throws IllegalArgumentException if position does not exist in the hand
     */
    public Card getCard(int position) {
        if(position >= 0 && position < hand.size())
            return (Card)hand.get(position);
        else
        throw new IllegalArgumentException();
        }

   /**
     * Computes and returns the total value of this hand in the game
     */
    public int getHandTotal () {
        int nbrAce = 0;
        int ValeurTotal = 0;
        for(int i=0;i<hand.size();i++){
            Card card = (Card)hand.get(i);
            if(card.getValue() > 1 && card.getValue() < 10){
                ValeurTotal += card.getValue();
            }
            else if(card.getValue()==1){
                ValeurTotal += card.getValue();
                nbrAce++;
            }
            else if(card.getValue() > 10){
                ValeurTotal+=10;
            }
            }
            while(nbrAce > 0){
                if((ValeurTotal+10) <=21){
                    ValeurTotal +=10;
                    nbrAce--;
                }
                else
                {
                    break;
                } 
            }
            return ValeurTotal; 
    }  
    
    /**
     * Sorts the cards in the hand so that cards of the same color are
     * grouped together, and within a color the cards are sorted by value.
     * Note that aces are considered to have the lowest value, 1.
     */
    public void sortByColor() {
        for(int i=0;i<hand.size()-1;i++){
            for(int j=0;j<hand.size()-1;j++){
                Card presenter = (Card)hand.get(j);
                Card next = (Card)hand.get(j+1);

                if((presenter.getColor()> next.getColor()) || ((presenter.getColor()==next.getColor()) && (presenter.getValue()> next.getValue()))){
                    hand.set(j, hand.get(j+1));
                    hand.set(j+1, presenter);
                }

            }
        }
    }

    /**
     * Sorts the cards in the hand so that cards of the same value are
     * grouped together.  Cards with the same value are sorted by color.
     * Note that aces are considered to have the lowest value, 1.
     */
    public void sortByValue() {
        for(int i=0;i<hand.size()-1;i++);{
            for (int j=0;j<hand.size()-1;j++){
                Card presenter = (Card)hand.get(j);
                Card next = (Card)hand.get(j+1);
                if((presenter.getValue() > next.getValue())|| ((presenter.getValue()==next.getValue())&&(presenter.getColor()> next.getColor()))){
                    hand.set(j, hand.get(j+1));
                    hand.set(j+1,presenter);
                }

            }
        }
    }
} 