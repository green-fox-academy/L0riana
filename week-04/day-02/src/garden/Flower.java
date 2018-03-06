package garden;

public class Flower extends Plant {

  public Flower(String color) {
    super(color);
    setType("Flower");
  }

  public void addWater(String type) {
    if (getType() == "Flower") {
      setWateringTreshold(5);
    }
  }

  public void setWaterLevel(int addWaterAmount) {
    //returns the currentWaterLevel

  }
}



