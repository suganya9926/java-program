
import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int a,b,c;
        System.out.println("enter value of a:");
        a=obj.nextInt();
        System.out.println("enter value of b:");
        b=obj.nextInt();
        System.out.println("enter value of c:");
        c=obj.nextInt();
        if(a>b && a>c)
        {
            System.out.println("a is big");
        }
        else if(b>a && b>c)
        {
            System.out.println("b is big");
        }
        else
        {
            System.out.println("c is big");
        }
        
    }
    
}
