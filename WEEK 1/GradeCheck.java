import java.util.Scanner;
public class GradeCheck {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter your exam score: ");
        int score=input.nextInt();

        if(score <0 || score>100){
            System.out.println("Invalid Input");
        }
        else{
            switch (score/10){
                case 10:
                case 9:
                System.out.println("A(Excellent)");
                break;
                case 8:
                System.out.println("B(Very Good)");
                break;
                case 7:
                System.out.println("C(Good)");
                break;
                case 6:
                System.out.println("D(Satisfactory)");
                break;
                default:
                System.out.println("F(Fail)");
                break;
            }
        }
    }
}
