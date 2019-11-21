import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.assertEquals;

public class GameTest {

    private Player player1, player2;
    private Game cardGame;
    private Card losingCard;
    private Card winningCard;
    private Card matchingCard;

    @Before
    public void before() {
        player1 = new Player("Elliot");
        player2 = new Player("Adrian");

        cardGame = new Game(player1, player2);

        losingCard = new Card(SuitType.HEARTS, RankType.THREE);
        winningCard = new Card(SuitType.DIAMONDS, RankType.QUEEN);
        matchingCard = new Card(SuitType.CLUBS, RankType.ACE);
    }

    @Test
    public void gameHasPlayers(){
        assertEquals("Elliot", cardGame.getPlayer1().getName());
        assertEquals("Adrian", cardGame.getPlayer2().getName());

    }
}