package garden;

public class Application {

  public static void main(String[] args) {

    Garden myGarden = new Garden();

    Flower yellow = new Flower("yellow");
    myGarden.add(yellow);
    Flower blue = new Flower("blue");
    myGarden.add(blue);
    Tree purple = new Tree("purple");
    myGarden.add(purple);
    Tree orange = new Tree("orange");
    myGarden.add(orange);

    myGarden.getWaterInfo();
    myGarden.wateringPlants();

  }
}
