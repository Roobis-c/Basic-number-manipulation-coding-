//perfect number is a positive integer that is equal to the sum of its proper divisors. //
// i/p: 6 -----> proper divisor of 6 is 1,2,3 and their sum (1+2+3) is 6
//                which is equal to given input
//             6(sum of proper divisiors)==6(given number)

// o/p :6 is perfect number





import java.util.*;
public class perfect_number_of_not
{
    static void perfect(int a)
    {
        int sum=0;
    for(int i=1;i<a;i++)
    {
    if(a%i==0)
    {
       sum=sum+i;
    }
    }
    if(sum==a)
        System.out.println(a+" is a perfect number");
    else
        System.out.println(a+" not a perfect number");
    }
	public static void main(String[] args) {
		int a;
		Scanner s=new Scanner(System.in);
		a=s.nextInt();
		perfect(a);
	}
}
