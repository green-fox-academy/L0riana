package fishtank;

public class Tang extends Fish {

  protected boolean shortTermMemoryLoss;

  public Tang(String name, int weight, String color, boolean shortTermMemoryLoss) {
    super(name, weight, color);
    this.shortTermMemoryLoss = shortTermMemoryLoss;
  }

  @Override
  public String status() {
    return super.status() + ", short-term memory loss: " + shortTermMemoryLoss;
  }
}
