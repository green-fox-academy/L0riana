import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class PokerTest {

  private Poker poker = new Poker();
  private Card card;
  private List<Card> black;
  private List<Card> white;

  @Test
  public void getCardValueTest() {
    card = new Card("K", "D");
    int output = card.getCardValue();
    assertEquals(13, output);
  }

  @Test
  public void toStringTest() {
    card = new Card("K", "D");
    String output = card.toString();
    assertEquals("King", output);
  }

  @Test
  public void checkHighestCardTest() {
    black = new ArrayList<>(Arrays.asList(new Card("2", "H"), new Card("3", "D"),
            new Card("5", "S"), new Card("9", "C"), new Card("K", "D")));
    white = new ArrayList<>(Arrays.asList(new Card("2", "C"), new Card("3", "H"),
            new Card("4", "S"), new Card("8", "C"), new Card("A", "H")));
    String output = poker.checkHighestCard(black, white);
    assertEquals("White wins! - (High card: Ace)", output);
  }
}
