// below program will rotate all element in array for given number of time from backward
// i/p: 5
//      1 2 3 4 5
// o/p: 5 4 1 2 3 

import java.util.*;
public class rotate
{
  static void rot (int n, int a[], int b)
  {
	int x = a[n - 1];
	for (int i = 0; i < b; i++)
	  {

		for (int j = 1; j < n; j++)
		  {
			a[n - j] = a[n - j - 1];
		  }
		a[0] = x;
		x = a[n - 1];
	  }
	for (int i = 0; i < n; i++)
	  System.out.print (a[i] + " ");
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
	int b = s.nextInt ();
	rot (n, a, b);
  }
}