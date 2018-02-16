import java.util.Scanner;

public class exercise17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sum;
        double average;

        System.out.println("Please, give us five whole numbers here. Press enter after each number.");

        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();
        int thirdNumber = scanner.nextInt();
        int forthNumber = scanner.nextInt();
        int fifthNumber = scanner.nextInt();

        sum = firstNumber + secondNumber + thirdNumber + forthNumber + fifthNumber;
        average = sum / 5;

        System.out.println("The sum of your five numbers is: " + sum);
        System.out.println("The average of your five numbers is: " + average);
        }
}
