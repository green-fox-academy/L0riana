package dice;

import java.util.Arrays;

public class Dice {
  //    You have a dice class which has 6 dice
  //    You can roll all of them with roll()
  //    Check the current rolled numbers with getCurrent()
  //    You can reroll with reroll()
  //    Your task is to get where all dice is a 6
  int[] dices = new int[6];

  public static void main(String[] args) {
    Dice myDice = new Dice();

    myDice.roll();
    myDice.getCurrent();
    myDice.reroll();

    System.out.println("First 6 roll: " + myDice.toString());

    int countRound = 0;

    for (int i = 0; i < myDice.dices.length; i++) {
      while (myDice.getCurrent(i) != 6){
        myDice.reroll(i);
        System.out.println("Check values in each round: " + myDice.toString());
        countRound++;
      }
    }
    System.out.println("Check if all values are 6: " + myDice.toString());
    System.out.println("Reroll nr: " + countRound);
  }

  public int[] roll() {
    for (int i = 0; i < dices.length; i++) {
      dices[i] = (int) (Math.random() * 6) + 1;
    }
    return dices;
  }

  public int[] getCurrent() {
    return dices;
  }

  public int getCurrent(int i) {
    return dices[i];
  }

  public void reroll() {
    for (int i = 0; i < dices.length; i++) {
      dices[i] = (int) (Math.random() * 6) + 1;
    }
  }

  public void reroll(int k) {
    dices[k] = (int) (Math.random() * 6) + 1;
  }
  @Override
  public String toString() {
    return "dice{" +
            "dices = " + Arrays.toString(dices) +
            '}';
  }
}
