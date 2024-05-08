import java.util.*;
import java.lang.*;

public class count_digit{

    static void count(int a)
    {
    int b=a,c=0;
    while(b>0)
    {
    c+=1;
    b=b/10;
    }

      System.out.print(c);
    }
    public static void main(String[] args) {
      Scanner s=new Scanner(System.in);
      int a=s.nextInt();
     count(a);
  }
}