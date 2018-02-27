import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;

public class CountLines {
  public static void main(String[] args) throws IOException {
    // Write a function that takes a filename as string,
    // then returns the number of lines the file contains.
    // It should return zero if it can't open the file, and
    // should not raise any error.
    countLines();
  }

  private static void countLines() throws IOException {
    ArrayList<String> list = new ArrayList<>(Arrays.asList("dog", "cat", "mouse"));
    String pathString = "my-file.txt";
    Path path1 = Paths.get(pathString);
    File file1 = new File(pathString);
    int i = 0;
    try {
      if (!file1.exists()) {
        System.out.println("Unable to read file: my-file.txt. It will be created.");
        file1.createNewFile();
      }
      Files.write(path1, list);
      for (String line : Files.readAllLines(path1)) {
        i++;
      }
      System.out.println("The file contains " + i + " lines.");
    } catch (IOException e) {
      e.printStackTrace();

    } finally {

    }
  }
}