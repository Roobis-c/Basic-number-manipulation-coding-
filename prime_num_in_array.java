// Below program is used to print prime number in a array
// o/p: 5
//      1 6 5 3 7
// o/p:  5 3 7 


import java.util.*;
public class prime_num_in_array
{
  static int prime (int a)
  {
      int c = 0;
		for (int i = 2; i <= a / 2; i++)
		  {
			if (a % i == 0)
			  {
				c = 1;
				break;
			  }
		  }
     	if (c == 0)
		  {
			return 1;
		  }
		else
		  {
			return 0;
		  }
  }
  static void fina (int n, int a[])
  {
	for (int i = 0; i < n; i++)
	  {
	      if(a[i]>1)
	      {
		 int c = prime (a[i]);
	      
		if (c == 1)
		  {
			System.out.print (a[i] + " ");
		  }
	  }
	  }

  }

  public static void main (String[]args)
  {
	Scanner s = new Scanner (System.in);
	int n = s.nextInt ();
	int a[] = new int[n];
	for (int i = 0; i < n; i++)
	  {
		a[i] = s.nextInt ();
	  }
	fina (n, a);
  }
}
