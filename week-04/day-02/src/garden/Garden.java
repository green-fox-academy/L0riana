package garden;

import java.util.ArrayList;

public class Garden {

  private ArrayList<Plant> plants;

  public Garden() {
    plants = new ArrayList<>();
  }

  public void add(Plant plant) {
    plants.add(plant);
  }

  public void getWaterInfo() {
    for (Plant plant : plants) {
      plant.needWater();
    }
  }

  public void wateringPlants() {
    for (Plant plant : plants) {
      plant.watering();
    }
  }


}