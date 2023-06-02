import java.util.*;
public class solution
{
    public static String DefangingIpAdress(String str)
    {
        String x="";
         for(int i = 0; i < str.length(); i++)
    {
       char c = str.charAt(i);
       if(c == '.')
       {
           x += "[.]";
       }
       else
       {
           x += c;
       }
    }
    return x;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String ipadress=DefangingIpAdress(str);
        System.out.println(ipadress);
        
    
    }
}