package animal;

public class Main {

  public static void main(String[] args) {
    // write your code here
    Animal tiger = new Animal();

    tiger.eat();
    tiger.drink();

    System.out.println(tiger.getHunger());
    System.out.println(tiger.getThirst());

    tiger.play();

    System.out.println(tiger.getHunger());
    System.out.println(tiger.getThirst());
  }
}
