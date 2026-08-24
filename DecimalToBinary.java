import java.util.Scanner;

public class 
 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter decimal number: ");
        int num = sc.nextInt();

        int binary = 0;
        int place = 1;

        while (num != 0) {

            int remainder = num % 2;

            binary = binary + remainder * place;

            num = num / 2;

            place = place * 10;
        }

        System.out.println("Binary = " + binary);

        sc.close();
    }
}