import java.util.List;

public class Poker {

  public String checkWin(List<Card> black, List<Card> white) {
    return checkHighestCard(black, white);
  }

  private String checkHighestCard(List<Card> black, List<Card> white) {
    Card maxBlack = black.get(0);
    Card maxWhite = white.get(0);
    for (Card card : black) {
      if (card.getCardValue() > maxBlack.getCardValue()) {
        maxBlack = card;
      }
    }
    for (Card card : white) {
      if (card.getCardValue() > maxWhite.getCardValue()) {
        maxWhite = card;
      }
    }
    if (maxBlack.getCardValue() > maxWhite.getCardValue()) {
      return "Black wins! - (High card: " + maxBlack.convertValue() + ")";
    } else {
      return "White wins! - (High card: " + maxWhite.convertValue() + ")";
    }
  }
}
