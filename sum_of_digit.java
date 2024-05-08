import java.util.*;
import java.lang.*;

public class sum_of_digit{

    static void reverse(int a)
    {
    int b=a,sum=0;
    while(b>0)
    {
     int d=b%10;
     sum=sum+d;
     b=b/10;
    }

      System.out.print(sum);
    }
    public static void main(String[] args) {
      Scanner s=new Scanner(System.in);
      int a=s.nextInt();
     reverse(a);
  }
}