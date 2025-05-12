/*adam share a money to charity from day one to n day.but he share money to charity with day^2;
sample input :2
sample output:5
  which means that-->2 days he gave a money to charity.....(1^2=1)+(2^2=4)====5*/
import java.util.*;
public class adam
{
    static void adam(int a)
    {
        int i,sum=0;
        for(i=1;i<=a;i++)
        {
          sum=sum+((int)Math.pow(i,2));  
        }
        System.out.println(sum);
        }
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		adam(a);
	}
}