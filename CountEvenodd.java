
import java.util.Scanner;

public class CountEvenodd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter numbers");
        int n=sc.nextInt();

        int even=0;
        int odd=0;
        while (n != 0) { 
            int d=n%10;

            if(d%2==0){
                even ++;

            }
            else{
                odd ++;
            }
            n=n/10;
        }
        System.out.println("Count Even numbers: " + even);
        System.out.println("Count Odd numbers: " + odd);
    }
}
