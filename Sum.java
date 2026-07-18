
import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        int n=sc.nextInt();
        int sum=0;
        while (n != 0) { 
            int d=n%10;
            sum=sum + d;
            n=n/10;

        }
        System.out.println("Sum: "+sum);
    }
    
}
