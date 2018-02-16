import java.util.Scanner;

public class teszt {
    public static void main(String[] args) {

        double sum = 0;
        double average = 0;

        for(int i=1 ; i<=5 ; i++){
            Scanner scanner = new Scanner( System.in);
            System.out.println("Enter number" + " " + i);
            double myNumber = scanner.nextDouble();
            sum = sum + myNumber;
            average = sum / 5;
        }
        System.out.println("The sum of your five numbers is: " + sum);
        System.out.println("The average of your five numbers is: " + average);
    }
}
