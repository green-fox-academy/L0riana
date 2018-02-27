import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

import static com.sun.jmx.snmp.ThreadContext.contains;

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
    String line;
    ArrayList<String> requests = new ArrayList<>();
    ArrayList<String> get = new ArrayList<>();
    ArrayList<String> post = new ArrayList<>();
    int getNr = 0;
    int postNr = 0;

    try {
      FileReader fr = new FileReader("log.txt");
      BufferedReader br = new BufferedReader(fr);
      while ((line = br.readLine()) != null) {
        line.split("\\s+");
        requests.add(line.split("\\s+")[6]);
        String[] requestArray = (String[]) requests.toArray();
      }
      System.out.println(requests);
      for (int i = 0; i < requests.toArray().length; i++) {
        if (requests.contains("GET")){
          getNr++;
        }

      }for (int i = 0; i < requests.size(); i++) {
        if (requests.contains("POST")) {
          postNr++;
        }
      }int requestNr = getNr/postNr;
      System.out.println(getNr);
      System.out.println(postNr);
      System.out.println(requestNr);
    } catch (IOException e) {
      System.out.println("File not found!");
    }
  }
}
