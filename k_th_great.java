// below program is used to find kth greatest number
//   i/p: 5  size 
//        1 2 3 5 6
//        2      2nd greatest number in  given array is 5 


//   o/p: 5 




import java.util.*;


public class k_th_great
{
    static void k_th(int n,int a[],int b)
    {
        Arrays.sort(a);
        
        System.out.print(a[n-b]+" ");
    }
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
		    a[i]=s.nextInt();
		}
		int b=s.nextInt();
	k_th(n,a,b);
	}
}
