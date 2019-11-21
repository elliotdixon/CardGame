import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeckTest {

    private Deck myDeck;

    @Before
    public void before() {
        myDeck = new Deck();
    }


    @Test
    public void DeckHas52Cards() {
        assertEquals(52, myDeck.getCardsInDeck().size());
    }

    @Test
    public void CheckFirstCard() {
        assertEquals(1, myDeck.getCard().getRank().getValue());
        assertEquals("HEARTS", myDeck.getCard().getSuit().name());
        assertEquals(RankType.ACE, myDeck.getCard().getRank());
    }

    @Test
    public void removeCardFirstCard() {
        myDeck.removeCard();
        assertEquals(2, myDeck.getCard().getRank().getValue());
        assertEquals("HEARTS", myDeck.getCard().getSuit().name());
        assertEquals(RankType.TWO, myDeck.getCard().getRank());
    }

}