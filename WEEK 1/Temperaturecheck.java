import java.util.Scanner;
public class Temperaturecheck{
    
public static void main(String [] args ){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the Temperature in celsius : ");
    int temp = input.nextInt();
    if (temp >= 30){
        System.out.println("Its hot ");
    }
    else if (temp > 20 &&  temp <=30){
        System.out.println("Its warm ");
    }
    else if (temp >= 10 && temp <= 20){
        System.out.println("Its cool ");
    }
    else {
        System.out.println("its cold ");
    }

}
}