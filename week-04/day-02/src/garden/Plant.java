package garden;

import java.util.ArrayList;

public class Plant {

  private String color;
  private String type;
  private int currentWaterLevel = 0;
  private int wateringTreshold = 5;
  ArrayList<String> flowers = new ArrayList<String>();
  ArrayList<String> trees = new ArrayList<String>();

  public Plant(String color) {
    this.color = color;
  }

  public void needWater() {
    if (currentWaterLevel < wateringTreshold) {
      System.out.println("The " + color + " " + type + " needs water.");
      watering();
    } else {
      System.out.println("The " + color + " " + type + " doesn't need water.");
    }
  }

  public void watering() {
    // for each elements of flowers and trees arraylists, water plants by
    // the amount of water divided by the sum size of the lists

    //for ( //
    //        addWaterAmount /= (flowers.size() + trees.size());
  }

  public void setWaterLevel(int addWaterAmount) {
    //water / plant increases the waterlevel, so set waterlevel
    // set flower water level += water * 0.75
    // set trees water level += water * 0.40
    // return currentWaterLevels

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
    return currentWaterLevel;
  }

  public void setCurrentWaterAmount(int currentWaterAmount) {
    this.currentWaterLevel = currentWaterAmount;
  }

  public int getWateringTreshold() {
    return wateringTreshold;
  }

  public void setWateringTreshold(int wateringTreshold) {
    this.wateringTreshold = wateringTreshold;
  }

  public ArrayList<String> getFlowers() {
    return flowers;
  }

  public void setFlowers(ArrayList<String> flowers) {
    this.flowers = flowers;
  }

  public ArrayList<String> getTrees() {
    return trees;
  }

  public void setTrees(ArrayList<String> trees) {
    this.trees = trees;
  }
}
