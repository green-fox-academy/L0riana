public class Printer {

  public static void main(String[] args) {
    // - Create a function called `printer`
    //   which prints the input String parameters
    // - It can have any number of parameters

    // Examples
    // printer("first")
    // printer("first", "second")
    // printer("first", "second", "third", "fourth")
    // ...
    String[] words = {"apple", "monkey", "dog", "rabbit"};
    printer(words);
  }

  static void printer(String... words) {
    System.out.print("printer(");
    for (String word : words) System.out.print("\"" + word + "\", ");
    System.out.print(")");
  }
}
