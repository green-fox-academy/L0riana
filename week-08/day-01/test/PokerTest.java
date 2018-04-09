import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class PokerTest {

  private Poker poker = new Poker();
  private Card card = new Card("K", "D");
  private List<Card> black = new ArrayList<>(Arrays.asList(new Card("2", "H"), new Card("3", "D"),
          new Card("5", "S"), new Card("9", "C"), new Card("K", "D")));
  private List<Card> white = new ArrayList<>(Arrays.asList(new Card("2", "C"), new Card("3", "H"),
          new Card("4", "S"), new Card("8", "C"), new Card("A", "H")));


  @Test
  public void checkHighestCardTest() {
    String output = poker.checkWin(black, white);
    assertEquals("White wins! - (High card: Ace)", output);
  }

  @Test
  public void getCardValueTest() {
    int output = card.getCardValue();
    assertEquals(13, output);
  }

  @Test
  public void convertValueTest() {
    String output = card.convertValue();
    assertEquals("King", output);
  }
}
