import java.util.Scanner;
public class Checknumber {
    public static void main(String [] args ){
        int n;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        n = input.nextInt();

        
  if  (n == 0){
        System.out.println("its zero");
    }
   else if (n % 2 == 0){
            System.out.println( n +  " is Even Number  ");
        }
        else {
            System.out.println( n + " is an Odd Number " );
        }
    }
}