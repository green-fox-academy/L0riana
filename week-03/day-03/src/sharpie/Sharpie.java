package sharpie;

public class Sharpie {

  private String color;
  private float width;
  private float inkAmount = 100;

  public Sharpie(String color, float width) {
    this.color = color;
    this.width = width;
  }
  public void use(){
    inkAmount -= 5;
  }

  @Override
  public String toString() {
    return "Sharpie{" +
            "color = '" + color + '\'' +
            ", width = '" + width + '\'' +
            ", inkAmount = '" + inkAmount + '\'' +
            '}';
  }
}
