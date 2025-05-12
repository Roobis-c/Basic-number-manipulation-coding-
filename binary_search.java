import java.util.*;				//BINARY SEARCH
public class  binary_search
{
  static int search (int st, int end, int a[], int k)
  {
	if (st > end)
	  {
		System.out.print ("NO");
		return 0;
	  }
	int mid = ((st + end) / 2);
	if (a[mid] == k)
	  {
		System.out.print ("Yes");
		return 0;
	  }
	else if (k < a[mid])
	  {
		search (st, mid - 1, a, k);
	  }
	else if (k > a[mid])
	  {
		search (mid + 1, end, a, k);
	  }
	return 0;
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
	int k = s.nextInt ();
	int st = 0;
	int end = n - 1;
	search (st, end, a, k);
  }
}
