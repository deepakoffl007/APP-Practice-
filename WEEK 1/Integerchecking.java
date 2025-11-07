import java.util.Scanner;
public class Integerchecking{

    
    public static void main (String [] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a integer : ");
    int a = input.nextInt();
    if (a<=-1){
        System.out.println("its Negative ");
    }
    else if (a>=1){
        System.out.println("its Positive ");
        
    }
    else {
        System.out.println("Zero");
    }
}
}