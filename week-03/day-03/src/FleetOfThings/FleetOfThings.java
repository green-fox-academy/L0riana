package FleetOfThings;

public class FleetOfThings {

  public static void main(String[] args) {
    Fleet fleet = new Fleet();
    // Create a fleet of things to have this output:
    // 1. [ ] Get milk
    // 2. [ ] Remove the obstacles
    // 3. [x] Stand up
    // 4. [x] Eat lunch
    Thing milk = new Thing("Get milk");
    fleet.add(milk);
    Thing remove = new Thing("Remove the obstacles");
    fleet.add(remove);
    Thing stand = new Thing("Stand up");
    fleet.add(stand);
    stand.complete();
    Thing eatLunch = new Thing ("Eat Lunch");
    fleet.add(eatLunch);
    eatLunch.complete();

    System.out.println(fleet);
  }
}