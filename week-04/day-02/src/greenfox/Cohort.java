package greenfox;

import java.util.ArrayList;

public class Cohort extends Student{
  public String name;
  ArrayList<Student> students = new ArrayList<>();
  ArrayList<Mentor> mentors = new ArrayList<>();

  public void info(){
    System.out.println("The " + name + " cohort has " + students.size() +  " students and " + mentors.size() + " mentors.");
  }

  public Cohort(String name){
    students.isEmpty();
    mentors.isEmpty();

  }

  public void addStudent(Student student) {

  }

  public void addMentor(Mentor mentor) {
  }
}
