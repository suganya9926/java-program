import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in); 
        System.out.println("enter any year");
        int year=obj.nextInt();
        if(year%4==0)
        {
            System.out.println("given year is a leap year");
        }
        else
        {
            System.out.println("given year is not a leap year");
        }
        
    }
    
}
