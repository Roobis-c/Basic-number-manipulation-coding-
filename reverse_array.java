// the below program is used to  reverse the array of given length
// o/p: 5
//      1 2 3 4 5
// o/p: 5 4 3 2 1   



import java.util.*;
public class reverse_array
{
  static void rev (int n, int a[])
  {
	int t;
	for (int i = 0; i < n / 2; i++)
	  {
		t = a[i];
		a[i] = a[n - 1 - i];
		a[n - 1 - i] = t;
	  }
	for (int i = 0; i < n; i++)
	  {
		System.out.print (a[i] + " ");
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
	rev (n, a);
  }
}
