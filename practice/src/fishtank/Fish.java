package fishtank;

public class Fish {
  //Each fish has a name, weight, color and has a status and feed method.
  private String name;
  private int weight;
  private String color;
  private boolean shortTermMemoryLoss;
  private int weightGain;

  public Fish() {
    this.name = name;
    this.weight = 0;
    this.color = color;
  }

  public Fish(boolean ShortTermMemoryLoss) {
    ShortTermMemoryLoss = true;
  }

  public String getStatus(){
    return "Name: " + name + ", Weight: " + weight + ", color " + color;
  }

  public int feed(){
    return weight++;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getWeight() {
    return weight;
  }

  public void setWeight(int weight) {
    this.weight = weight;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }
}
