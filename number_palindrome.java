import java.util.*;
import java.lang.*;

public class number_palindrome{

    static void reverse(int a)
    {
    int b=a,sum=0;
    while(b>0)
    {
     int d=b%10;
     sum=(sum*10)+d;
     b=b/10;
    }
    if(a==sum)
      System.out.print("number is palindrome");
    else
      System.out.print("number is not a palindrome");
    }
    public static void main(String[] args) {
      Scanner s=new Scanner(System.in);
      int a=s.nextInt();
     reverse(a);
  }
}