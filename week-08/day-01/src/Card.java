public class Card {

  private String value;
  private String color;

  public Card() {

  }

  public Card(String value, String color) {
    this.value = value;
    this.color = color;
  }

  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public int getCardValue() {
    if (this.value.equalsIgnoreCase("t")) {
      return 10;
    } else if (this.value.equalsIgnoreCase("j")) {
      return 11;
    } else if (this.value.equalsIgnoreCase("q")) {
      return 12;
    } else if (this.value.equalsIgnoreCase("k")) {
      return 13;
    } else if (this.value.equalsIgnoreCase("a")) {
      return 14;
    } else {
      return Integer.parseInt(this.value);
    }
  }

  public String convertValue() {
    int cardValue = getCardValue();
    if (cardValue == 10) {
      return "10";
    } else if (cardValue == 11) {
      return "Jack";
    } else if (cardValue == 12) {
      return "Queen";
    } else if (cardValue == 13) {
      return "King";
    } else if (cardValue == 14) {
      return "Ace";
    } else {
      return String.valueOf(cardValue);
    }
  }
}
