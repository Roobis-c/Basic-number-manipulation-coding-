 import java.util.*;

public class FactorialRecursion{
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int x=s.nextInt();
		int a=fact(x);
		System.out.print(a);
	}
	static int fact(int a)
	{
		if(a==1)
		{
			return 1;
		}
		return a*fact(a-1);
	}
}