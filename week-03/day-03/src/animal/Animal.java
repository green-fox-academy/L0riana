package animal;

public class Animal {
  /*
  Create an Animal class
  Every animal has a hunger value, which is a whole number
                  Every animal has a thirst value, which is a whole number
                  when creating a new animal object these values are created with the default 50 value
  Every animal can eat() which decreases their hunger by one
  Every animal can drink() which decreases their thirst by one
  Every animal can play() which increases both by one
  */
  private int hunger;
  private int thirst;

  public Animal() {
    hunger = 50;
    thirst = 50;
  }

  public int eat() {
    hunger++;
    return hunger;
  }

  public int drink() {
    thirst++;
    return thirst;
  }

  public int play() {
    hunger--;
    thirst--;
    return hunger;
  }

  public int getHunger() {
    return hunger;
  }

  public int getThirst() {
    return thirst;
  }
}
