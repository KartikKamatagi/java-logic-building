
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter terms of number: ");
        int n=sc.nextInt();

        int a=0;
        int b=1;

        System.out.println(" Series: ");
        for(int i=0; i<n; i++){
            System.out.println(a+ " ");
            int c=a+b;
            a=b;
            b=c;
        }
    }
}
