import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;

import static java.nio.file.StandardOpenOption.APPEND;

public class WriteMultipleLines {
  public static void main(String[] args) {
    // Create a function that takes 3 parameters: a path, a word and a number,
    // than it should write to a file.
    // The path parameter should be a string, that describes the location of the file.
    // The word parameter should be a string, that will be written to the file as lines
    // The number parameter should describe how many lines the file should have.
    // So if the word is "apple" and the number is 5, than it should write 5 lines
    // to the file and each line should be "apple"
    // The function should not raise any error if it could not write the file.
    String path = "my-file.txt";
    String word = "Yesss";
    int number = 5;
    getParameters(path, word, number);
    /*String myName = "Julianna Serly";
    try {

      Files.write(path1, myName.getBytes(),StandardOpenOption.APPEND);
      for (String line : Files.readAllLines(path1)) {
        System.out.println(line);
      }
    } catch (IOException e) {
      System.out.println("Unable to write file: my-file.txt");
    } finally {
    */
  }

  private static void getParameters(String path, String word, int number) {
    try {
      Path myPath = Paths.get(path);
      Files.write(Paths.get(path), word.getBytes(), new StandardOpenOption[]{StandardOpenOption.APPEND});
      for (int i = 0; i < number; i++) {
        System.out.println(word);
      }
    } catch (IOException e) {
      System.out.println("Unable to write file: my-file.txt");
    } finally {
    }
  }
}
