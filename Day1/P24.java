import java.util.*;
import java.math.*;
class P24
{
    public static void main(String []args)
    {
          Scanner sc=new Scanner(System.in);
          //int n=sc.nextInt();
          for(int i=1;i<=1000;i++){
          if(checkarmstrong(i))
               System.out.println("Armstrong Number "+i);
          }
    }
    static boolean checkarmstrong(int n)
    {
         int temp=n; 
         int count=0;
         int sum=0;
        while(temp!=0)
        {
             count++;
             temp=temp/10;
        }
        temp=n;
        while(temp!=0)
        {
              sum+=Math.pow(temp%10,count);
              temp=temp/10;
         }
        if(sum==n)
              return true;
        return false;
     }
}