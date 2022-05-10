//enumeration
enum dept{ECE,EEE,CSE,IT};

public class EnumDemo {
    public static void main(String[] args) {
           dept d[]=dept.values();
           for(dept c:d)
           {
               System.out.println(c);
           }
           
           System.out.println("sofiya dept is"+dept.CSE);
           
    }
    
}
