	// format:
	// i/p: hi
	//       hello

	//op: i,e,l,l,o


import java.util.*;
public class format_printing
{
  static void search (String a, String b)
  {
	int x = a.length ();
	int y = b.length ();
	int min = 0, max = 0;
	if (x <= y)
	  {
		min = x;
		max = y;
	  }
	else if (y < x)
	  {
		min = y;
		max = x;
	  }
	int f = 0;
	for (int i = 0; i < max; i++)
	  {
		if (i < min)
		  {
			if (a.charAt (i) != b.charAt (i))
			  {
				if (f == 1)
				  System.out.print (",");
				System.out.print (a.charAt (i) + "," + b.charAt (i));
				f = 1;
			  }
		  }
		else
		  {
			if (min == x)
			  {
				System.out.print ("," + b.charAt (i));
			  }
			else if (min == y)
			  {
				System.out.print ("," + a.charAt (i));
			  }
		  }
	  }
  }
  public static void main (String[]args)
  {
	Scanner s = new Scanner (System.in);
	String a = s.nextLine ();
	String b = s.nextLine ();
	search (a, b);

  }
}
