import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[]args) {
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int reverse =0;
        int rem;
        for(;number != 0; number = number /10  ) {
            rem = number % 10;
            reverse = reverse * 10 + rem;
        }
        System.out.printf("Reverse of entered number is: " +reverse);
    }
}
