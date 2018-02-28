package sharpie;

public class Sharpie {

  private String color;
  private float width;
  private float inkAmount = 100;

  public Sharpie(String color, float width) {
    this.color = color;
    this.width = width;
  }
  public float use(){
    inkAmount -= 5;
    return inkAmount;
  }

  public float getInkAmount(){
    return inkAmount;
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
