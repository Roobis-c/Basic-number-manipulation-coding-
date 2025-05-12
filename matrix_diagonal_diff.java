// below program is used to find the difference between diagonal of a matrix
// ip format: marix format
// o/p format: difference b/w diagonal of matrix


import java.util.*;
import java.lang.*;
public class matrix_diagonal_diff
{
	public static void main(String[] args) 
	{
	Scanner s=new Scanner(System.in);
	int r=s.nextInt();
	int c=s.nextInt();
	int a[][]=new int[r][c];
	for(int i=0;i<r;i++)
	{
	    for(int j=0;j<c;j++)
	    {
	        a[i][j]=s.nextInt();
	    }
	}
	int s0=0,s1=0;
for(int i=0;i<r;i++)
{
    s0+=a[i][i];
    s1+=a[i][r-i-1];
}
int result;
if(s1>s0)
     result=s1-s0;
else
     result=s0-s1;
	System.out.println("****************************************************************");
	System.out.println(result);
	
	}
}