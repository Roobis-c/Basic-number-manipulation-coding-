import java.util.*;

public class space_count 
{
  static void string_space(String str)
  {
     int c=0;
    for(int i=0;i<str.length();i++)
    {
    if (str.charAt(i)==32) 
      {
         c=c+1;
      }
    }
  System.out.print(c);
  }
  
  
  
  
  public static void main(String[] args)
  {
   Scanner s=new Scanner(System.in);
  String str=s.nextLine();
   string_space(str);
  }
}