import java.util.*;
import java.lang.*;

public class palindrome_string {
    
    static void palindrome(String str)
    {
      int a=str.length();
      String str2="";
      for(int i=a-1;i>=0;i--)
      {
        str2=str2 + str.charAt(i);
      }
     if(str.equals(str2))
     {
      System.out.print(str+" is a palindrome");
     }  
    else
    {
      System.out.print(str+" is not a palindrome");
    }
    }
    
    public static void main(String[] args) {
      Scanner s=new Scanner(System.in);
      String str=s.nextLine();
      palindrome(str);
  }
}