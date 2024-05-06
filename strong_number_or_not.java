//A strong number is a positive integer whose sum of factorials of its digits equals the number itself
// ip: 145------>1 factorial =1
//               4 factorial=24
//               5 factorial=120
//                               (1+24+120)=145 
// op: 145 is a Strong number              


import java.util.*;
 class strong_number_or_not
{
    static void strong(int a)
    {
        int x=a,d,fa=1,fa2=0;
      while(a>0)
      {
        d=a%10;
        for( int i=1;i<=d;i++)
        {
          fa=fa*i;
        }
       fa2+=fa;
       fa=1;
        a=a/10;
      }
      if(x==fa2)
        System.out.println(x+" is a strong number");
      else
        System.out.println(x+" is not a strong number");
    }
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    int a=s.nextInt();
	    strong(a);

	}
}
