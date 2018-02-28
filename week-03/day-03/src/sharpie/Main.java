package sharpie;

public class Main {

  public static void main(String[] args) {
    // write your code here
    Sharpie marker1 = new Sharpie("black", 2.2f);

    System.out.println(marker1.toString());

    marker1.use();
    marker1.use();

    System.out.println(marker1.toString());
  }
}
