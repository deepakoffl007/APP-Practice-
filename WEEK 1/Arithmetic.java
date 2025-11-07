 
// 1.	Adds the two numbers
//	2.	Multiplies the result by 2
//	3.	Subtracts 10 from the result
//	4.	Displays the final value
import java.util.Scanner;
public class Arithmetic {
    public static void main (String [] args ){
        Scanner input = new Scanner(System.in);
        int a,b,result, sub;
        System.out.print("Enter two numbers :");
        a = input.nextInt();
        b = input.nextInt();
        result = (a+b)*2;
        sub = result-10;
        System.out.println("The final value : " +sub);
       

     


    }
}