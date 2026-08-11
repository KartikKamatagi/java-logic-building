
import java.util.Scanner;

public class AutomorphicNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int num=sc.nextInt();
        int original=num;

        int square=num*num;
        int count=0;
        int temp=num;

        while(num != 0){
            count ++;
            temp=temp/10;


        }
        int divisor=1;
        for(int i=0; i<=count; i++){
            divisor=divisor*10;
        }
        if(square % divisor == 0){
            System.out.println("its AutomorphicNumber ");
        }else{
            System.out.println("its not AutomorphicNumber ");
        }

    }
    
}
