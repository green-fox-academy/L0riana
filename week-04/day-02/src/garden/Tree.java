package garden;

public class Tree extends Plant {

  public Tree(String color) {
    super(color);
    setType("Tree");
  }

  public void addWater(String type) {
    if (getType() == "Tree") {
      setWateringTreshold(10);
    }
  }

  public void setWaterLevel(int addWaterAmount) {
    //returns the currentWaterLevel

  }
}
