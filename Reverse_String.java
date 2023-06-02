import java.util.*;
public class solution
{
    public static String ReverseString(String s)
    {
        char ch[]=s.toCharArray();
        String rev="";
        for(int i=ch.length-1;i>=0;i--)
        {  
        rev+=ch[i];  
        }  
    return rev;  
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String reverse=ReverseString(str);
        System.out.println(reverse);
    }
}