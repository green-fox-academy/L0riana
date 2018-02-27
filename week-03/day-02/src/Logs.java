import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;

public class Logs {
  public static void main(String[] args) {
    // Read all data from 'log.txt'.
    // Each line represents a log message from a web server
    // Write a function that returns an array with the unique IP adresses.
    // Write a function that returns the GET / POST request ratio.
    uniqueAddress();
    requestRatio();

  }

  private static void uniqueAddress() {
    String line;
    ArrayList<String> addressIPs = new ArrayList<>();
    try {
      FileReader fr = new FileReader("log.txt");
      BufferedReader br = new BufferedReader(fr);
      while ((line = br.readLine()) != null) {
        line.split("\\s+");
        addressIPs.add(line.split("\\s+")[5]);
      }
      Set<String> uniqueIP = new HashSet<String>(addressIPs);
      for (String element : uniqueIP) {
        System.out.println(element);
      }
      /*List<String> uniqueIP = addressIPs.stream().distinct().collect(Collectors.toList());
      for (String element : uniqueIP) {
        System.out.println(element);
      }*/
    } catch (IOException e) {
      System.out.println("File not found!");
    }
  }

  private static void requestRatio() {
    /*int countGet = 0;
    int countPost = 0;
    try {
      FileReader fr = new FileReader("log.txt");
      BufferedReader br = new BufferedReader(fr);
      String line = br.readLine();
      while ((line = br.readLine()) != null) {
        line.split("\\s+");
        String[] columns = line.split(" ");
        while (fr.hasNextLine()) {
          String nextToken = scanner.next();
          if (nextToken.equalsIgnoreCase())
            count++;
        }
      }
    } catch (IOException e) {
      e.printStackTrace();
    */
  }
}
