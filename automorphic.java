// The below program is used to calculate whether a number is automorphic or not
// Explanation : i/p 5--->5^2=25  square of given number ends with given number so it is automorphic
//               i/p 2--->2^2=4   not a automorphic 




import java.util.*;
public class automorphic
{
    static void auto(int a)
    {
        int c=0,temp=a,t,d,sum=0;
        int sq=a*a,x,y=sq;
        while(temp>0)
        {
          t=temp%10;
          x=y%10;
            if(t==x)
              sum=sum+1;
            c=c+1;
            temp=temp/10;
            y=y/10;
        }
       if(sum==c)
        System.out.println("automorphic");
       else
        System.out.println("non ");
        
    }
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		auto(a);
	}
}