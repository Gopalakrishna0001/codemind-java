import java.util.*;
public class soltuion
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

         int n,s=0,r,temp;
    n=sc.nextInt();
    temp=n;
    while(n!=0)
    {
     r=n%10;
     s=s*10+r;
     n=n/10;
    }
    if(temp==s)
    System.out.println("True");
    else
    System.out.println("False");
    }
     
    
}