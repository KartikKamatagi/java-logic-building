import java.util.Scanner;

public class DuckNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        boolean duck = false;

        while (num != 0) {

            int digit = num % 10;
            

            if (digit == 0) {
                duck = true;
                break;
            }

            num = num / 10;
        }

        if (duck) {
            System.out.println("Duck Number");
        } else {
            System.out.println("Not a Duck Number");
        }

        sc.close();
    }
}