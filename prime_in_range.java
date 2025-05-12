// Below program is used to print a prime in range
//i/p:1 100
// o/p: 1 2 3 5 7 11 13 17 19 23 29 31 37 41 43 47 53 59 61 67 71 73 79 83 89 97



import java.util.*;
public class prime_in_range
{
    static void prime(int a,int b)
    {
        int i,j;
        for(i=a;i<=b;i++)
        {
            int c=0;
            for(j=2;j<=i/2;j++)
            {
                if(i%j==0)
                {
                    c++;
                    break;
                }
                
            }if(c==0){
                    System.out.print(i+" ");
                }   
            
        }
    }
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		prime(a,b);
	}
}
