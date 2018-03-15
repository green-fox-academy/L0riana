package fishtank;

public class Fish {
  protected String name;
  protected int weight;
  protected String color;

  public Fish(String name, int weight, String color) {
    this.name = name;
    this.weight = weight;
    this.color = color;
  }

  public String status() {
    return name + ", weight: " + weight + ", color: " + color;
  }

  public void feed() {
    weight++;
  }

  public int getWeight() {
    return weight;
  }

  public void setWeight(int weight) {
    this.weight = weight;
  }
}
