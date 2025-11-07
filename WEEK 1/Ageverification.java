import java.util.Scanner;
public class Ageverification{
    public static void main (String [] args ){
        Scanner input = new Scanner(System.in);
         System.out.print("Enter your current Age : ");
             int  age = input.nextInt();
             if (age <= 17 ){
                System.out.println("you are not Eligible to vote ");
            
             }
             else if (age >= 18 && age <= 122){
                System.out.println("You are Eligible to vote ");
             }
             else {
                System.out.println("You are not Eligible to vote ");
             }

    }
}