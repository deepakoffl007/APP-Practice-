import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter 1 for addition or 2 for subtraction.");
        int choice = input.nextInt();

        if (choice == 1) {
            System.out.print("Enter the first number: ");
            int num1 = input.nextInt();
            System.out.print("Enter the second number: ");
            int num2 = input.nextInt();
            int sum = num1 + num2;
            System.out.println("Sum: " + sum);
        } else if (choice == 2) {
            System.out.print("Enter the first number: ");
            int num1 = input.nextInt();
            System.out.print("Enter the second number: ");
            int num2 = input.nextInt();
            int difference = num1 - num2;
            System.out.println("Difference: " + difference);
        } else {
            System.out.println("Invalid choice! Please enter 1 or 2.");
        }

        input.close();
    }
}
