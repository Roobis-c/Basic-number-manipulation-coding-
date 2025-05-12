import java.util.*;
import java.lang.*;

public class reverse_given_string {
    static void reverse(String str)
    {
      int a=str.length();
      String str2=" ";
      for(int i=a-1;i>=0;i--)
      {
        str2=str2 + str.charAt(i);
      }
      System.out.print(str2);
    }
    public static void main(String[] args) {
      Scanner s=new Scanner(System.in);
      String str=s.nextLine();
      reverse(str);
  }
}