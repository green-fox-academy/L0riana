/*package dominoes;

import java.util.ArrayList;
import java.util.List;

public class Dominoes {
  public static void main(String[] args) {
    List<Domino> dominoes = initializeDominoes();
    // You have the list of dominoes
    // Order them into one snake where the adjacent dominoes have the same numbers on their adjacent sides
    // eg: [2, 4], [4, 3], [3, 5] ...
    sortDominoes();

    System.out.println(dominoes);
  }

  private static ArrayList<Domino> sortDominoes() {
    ArrayList<Domino> orderedList = new ArrayList<>();
    orderedList.add(0);
    for (int i = 0; i < initializeDominoes().size(); i++) {
      if (initializeDominoes().get(i) == initializeDominoes().get(i+1)){
        orderedList.add(i+1);
        initializeDominoes().remove(i);
      }
    }
    }


  static List<Domino> initializeDominoes() {
    List<Domino> dominoes = new ArrayList<>();
    dominoes.add(new Domino(5, 2));
    dominoes.add(new Domino(4, 6));
    dominoes.add(new Domino(1, 5));
    dominoes.add(new Domino(6, 7));
    dominoes.add(new Domino(2, 4));
    dominoes.add(new Domino(7, 1));
    return dominoes;
  }
}*/