package Pirates;

public class Pirate {

  private String name;
  private int intoxicationLevel;
  private boolean isDead;

  public Pirate(String name) {
    this.name = name;
    this.intoxicationLevel = 0;
    this.isDead = false;
  }

  public void drinkSomeRum() {
    if (!isDead) {
      intoxicationLevel++;
    } else {
      System.out.println(name + " is dead.");
    }
  }

  public String howsItGoingMate() {
    if (!isDead) {
      if (intoxicationLevel < 4) {
        return "Pour me anudder!";
      } else {
        return "Arghh, I'ma Pirate. How d'ya d'ink its goin?";
      }
    }
    return "He's dead.";

  }
  public void die() {
    isDead = true;
  }

  public void brawl(Pirate otherPirate){
    double random = Math.random();
    if (random > 0.67){
      this.die();
      System.out.println(name + " died.");
    }else if(random < 0.33) {
      otherPirate.die();
      System.out.println(otherPirate.name + " died.");
    }else {
      System.out.println("Both pirates passed out.");
    }

  }
}
