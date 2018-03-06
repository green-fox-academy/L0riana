package greenfox;

public class Sponsor extends Person {

  protected String company;
  protected int hiredStudents;

  public Sponsor(String name, int age, String gender, String company) {
    this.name = name;
    this.age = age;
    this.gender = gender;
    this.company = company;
    this.hiredStudents = 0;
  }

  public Sponsor() {
    hiredStudents = 0;
    company = "Google";
  }

  public void introduce() {
    System.out.println("Hi, I'm " + name + ", a " + age + " old " + gender + " who represents " + company +
            " and hired " + hiredStudents + " students so far.");
  }

  public void getGoal() {
    System.out.println("My goal is: Hire brilliant junior software developers.");
  }

  public void hire() {
    hiredStudents++;
  }
}