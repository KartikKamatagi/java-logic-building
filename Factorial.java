import java.util.Scanner;

public class Factorial {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("");
        int num=sc.nextInt();
        int fact=0;

        for(int i=1; i<num; i++){

            fact=fact*i;
            
            
        }
        System.out.println("factorial is :"+ fact);
    }
    
}
