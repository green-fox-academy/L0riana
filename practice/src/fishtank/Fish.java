package fishtank;

public class Fish {
  //Each fish has a name, weight, color and has a status and feed method.
  protected String name;
  protected int weight;
  protected String color1;
  protected String color2;
  protected boolean shortTermMemoryLoss;
  private int weightGain;

  public Fish(String name, int weight, String color1) {
    this.name = name;
    this.weight = weight;
    this.color1 = color1;
  }

}
