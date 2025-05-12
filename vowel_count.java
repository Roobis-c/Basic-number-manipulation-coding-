import java.util.*;
import java.lang.*;

public class vowel_count{

    static void vowel(String str)
    {
      int n=str.length();
      int c=0;
      for(int i=0;i<n;i++)
      {
        if((str.charAt(i)=='a'|| str.charAt(i)=='A')||(str.charAt(i)=='i'||str.charAt(i)=='I')||(str.charAt(i)=='e'||str.charAt(i)=='E')||(str.charAt(i)=='O'||str.charAt(i)=='o')||(str.charAt(i)=='U'||str.charAt(i)=='u'))
        {
         c++;
        }
      }

          System.out.print("no.of.vowel occurs is "+c);
    }
    public static void main(String[] args) {
      Scanner s=new Scanner(System.in);
      String str=s.nextLine();
     vowel(str);
  }
}