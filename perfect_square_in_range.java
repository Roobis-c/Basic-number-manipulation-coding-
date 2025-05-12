// The below program is used to calculate the perfect square number in range whivh is given as a input
// i/p:1 100 --->program will print all perfect square from 1 to 100(given input) 
// o/p:      1 4 9 16 25 36 49 64 81 100





import java.util.*;
import java.lang.*;
public class perfect_square_in_range {
  static void sqrt(int a,int b)
  {
    int c=(int)Math.ceil(Math.sqrt(a));
    int d=(int)Math.ceil(Math.sqrt(b));
    
    int x;
    for(int i=c;i<=d;i++)
    {
      x=(int)Math.pow(i,2);
    System.out.print(x+" ");
    }
  }
    public static void main(String[] args) {
      Scanner s=new Scanner(System.in);
      int a=s.nextInt();
      int b=s.nextInt();
      sqrt(a,b);
      
      
  }
}