/// factorial of Number ----->5=  1*2*3*4*5 =120
//factorial of Number ----->4=  1*2*3*4 = 24


import java.util.*;
import java.lang.*;

public class factorial{

    static void fact(int a)
    {
      int f=1;
    for(int i=1;i<=a;i++)
    {
      f=f*i;
    }
      System.out.print(f);
    }
    public static void main(String[] args) {
      Scanner s=new Scanner(System.in);
      int a=s.nextInt();
     fact(a);
  }
}