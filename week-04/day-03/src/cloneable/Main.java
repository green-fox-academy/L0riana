package cloneable;

public class Main {
  public static void main(String[] args) throws CloneNotSupportedException {
    Student john = new Student("John Doe", 20, "male", "BME");
    Student cloned = (Student) john.clone();
    System.out.println(cloned.getName());
  }
}