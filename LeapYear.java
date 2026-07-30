
import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter A year");
        int year=sc.nextInt();

        if(year % 400 == 0|| (year % 4==0 && year % 100 !=0)){
            System.out.println("Its a leaf yaer");
        }
        else{
            System.out.println("its not leap yaer");
        }
    }
    
}
