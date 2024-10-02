import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //variable + scanner
        Scanner scan = new Scanner(System.in);
        int birthMonth;

        //code
        System.out.println("please enter your birth month 1-12");
        birthMonth = scan.nextInt();

        if (birthMonth > 12){
            System.out.println("you have entered an invalid birth integer");
        }
    }
}