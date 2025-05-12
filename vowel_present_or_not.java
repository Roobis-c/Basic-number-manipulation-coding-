import java.util.*;
import java.lang.*;

public class vowel_present_or_not {

    static void vowel(String str)
    {
      int n=str.length();
      for(int i=0;i<n;i++)
      {
        if((str.charAt(i)=='a'|| str.charAt(i)=='A')||(str.charAt(i)=='i'||str.charAt(i)=='I')||(str.charAt(i)=='e'||str.charAt(i)=='E')||(str.charAt(i)=='O'||str.charAt(i)=='o')||(str.charAt(i)=='U'||str.charAt(i)=='u'))
        {
          n=-1;
          break;
        }
      }
        if(n==-1)
          System.out.print(str+" contains vowels");
        else
          System.out.print(str+" doesn't contain vowels");
    }
    public static void main(String[] args) {
      Scanner s=new Scanner(System.in);
      String str=s.nextLine();
     vowel(str);
  }
}