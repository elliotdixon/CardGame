import java.util.ArrayList;
import java.util.Collections;

public class Deck {
    private ArrayList<Card> cardsInDeck;

    public Deck() {
        this.cardsInDeck = new ArrayList<Card>();

        for (SuitType suit:SuitType.values()) {
            for (RankType rank:RankType.values()) {
                cardsInDeck.add(new Card(suit, rank));
            }
        }
    }

    public ArrayList<Card> getCardsInDeck() {

        return cardsInDeck;
    }

    public Card removeCard() {

        return cardsInDeck.remove(0);
    }

    public Card getCard() {

        return cardsInDeck.get(0);
    }

    public void shuffleDeck() {
        Collections.shuffle(cardsInDeck);
    }


}