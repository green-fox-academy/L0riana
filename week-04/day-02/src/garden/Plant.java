package garden;

public class Plant {

  private String color;
  private String type;
  private int currentWaterAmount;

  public Plant(String color) {
    this.color = color;
  }

  public void watering(int addWater) {
    currentWaterAmount += addWater;
  }

  public void needWater() {
    System.out.println("The " + color + " " + type + " needs water.");
  }

  public int getWaterStatus() {
    return currentWaterAmount;
  }

  public void setWaterStatus(int waterStatus) {
    this.currentWaterAmount = waterStatus;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public int getCurrentWaterAmount() {
    return currentWaterAmount;
  }

  public void setCurrentWaterAmount(int currentWaterAmount) {
    this.currentWaterAmount = currentWaterAmount;
  }
}

