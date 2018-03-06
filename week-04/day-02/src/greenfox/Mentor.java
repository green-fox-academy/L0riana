package greenfox;

public class Mentor extends Person {

  public String level;

  public Mentor(String name, int age, String gender, String level) {
    super();
    this.level = level;
  }

  public Mentor() {
    super();
    level = "intermediate";
  }
  @Override
  public void introduce() {
    System.out.println("Hi, I'm " + name + ", a " + age + " year old " + gender + " " + level + " mentor.");
  }

  public void getGoal() {
    System.out.println("My goal is: Educate brilliant junior software developers.");
  }
}