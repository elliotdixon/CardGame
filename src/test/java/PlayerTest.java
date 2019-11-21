
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayerTest {

    private Player player1;
    private Player player2;
    private Card card1;

    @Before
    public void before() {
        player1 = new Player("Elliot");
        player2 = new Player("Adrian");

        card1 = new Card(SuitType.HEARTS, RankType.FIVE);
    }

    @Test
    public void hasName() {
        assertEquals("Elliot", player1.getName());
        assertEquals("Adrian", player2.getName());
    }

    @Test
    public void canReceiveCard() {
        player1.receiveCard(card1);
        assertEquals(1, player1.getHand().size());
        assertEquals(Card.class, player1.showCard().getClass());

    }
}