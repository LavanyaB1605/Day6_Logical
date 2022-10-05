import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[]args) {
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int i, sum =0;

        for(i=1; i <= number/2; i++) {
            if(number % i == 0) {
                sum = sum + i;
            }
        }
        if(sum == number) {
            System.out.println("Entered Number is a perfect number"); }
        else {
            System.out.println("Entered Number is not a perfect number");
        }
    }
}
