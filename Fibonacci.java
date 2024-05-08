import java.util.*;
import java.lang.*;

public class Fibonacci {

    static void fibo(int x)
    {
      int a=0,b=1,c=0;
      System.out.println("0");
      System.out.println("1");
    for(int i=2;i<x;i++)
    {
      c=a+b;
      a=b;
      b=c;
      System.out.println(c);
    }

    }
    public static void main(String[] args) {
      Scanner s=new Scanner(System.in);
      int a=s.nextInt();
     fibo(a);
  }
}