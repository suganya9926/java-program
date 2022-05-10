import java.util.Scanner;
public class PrimeDemo {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("enter any number:");
        int n=obj.nextInt();
        int count=0;
        for(int i=1;i<=n;i++)  // i=1 to n
        {
            if(n%i==0)
            {
                count++;
            }
        }
        if(count==2)
        {
            System.out.printf("%d is a prime number",n);
        }
        else
        {
            System.out.printf("%d is not a prime number",n);
        }
    }
    
}
