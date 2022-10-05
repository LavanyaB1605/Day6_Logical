import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[]args) {
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        for(int i =2; i <= number / 2; i++) {
            if(number % i == 0) {
                System.out.println("Entered Number is not a Prime Number"); }
            else {
                System.out.println("Entered Number is a Prime Number");
            }
        }
    }
}
