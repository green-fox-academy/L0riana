public class DrawChessTable35 {
  public static void main(String[] args) {
    // Crate a program that draws a chess table like this
    //
    // % % % %
    //  % % % %
    // % % % %
    //  % % % %
    // % % % %
    //  % % % %
    // % % % %
    //  % % % %
    //
    for (int i = 0; i < 8; i++) {
      for (int j = 0; j < 4; j++) {
        if (i % 2 == 0) {
          System.out.print("% ");
        } else {
          System.out.print(" %");
        }
      }
      System.out.println();
    }
  }
}
