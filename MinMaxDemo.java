import java.util.Arrays;
public class MinMaxDemo {

    public static void main(String[] args) {
       int a[]={20,50,30,70,10,80,65};
       int min,max,temp;
//       for(int i=0;i<a.length;i++)
//       {
//           for(int j=i+1;j<a.length;j++)
//           {
//               if(a[i]>a[j])
//               {
//                   temp=a[i];
//                   a[i]=a[j];
//                   a[j]=temp;
//               }
//           }
//       }
Arrays.sort(a);
       for(int k:a)
       {
           System.out.println(k);
       }
       min=a[0];
       max=a[a.length-1];
        System.out.println("minimum value is"+min);
        System.out.println("maximum value is"+max);
       
    }
    
    
}
