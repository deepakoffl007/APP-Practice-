import java.util.Scanner;
public class Vending{
public static void main (String [] args ){
Scanner input = new Scanner(System.in);
System.out.print("Enter 1 for JUICE and 2 for SODA  :");
int n = input.nextInt();
if (n==1){
    System.out.println("Dispensing JUICE ");
}
else if (n==2){
    System.out.println("Dispensing SODA");
}
else {
    System.out.println("Invalid choice ");

}

}
}