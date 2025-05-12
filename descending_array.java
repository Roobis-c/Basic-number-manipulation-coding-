// The below program is used to sort a array element in descending array
// i/p: 5----->size of array
//      4 88 7 66 1

// o/p: 88 66 7 4 1




import java.util.Scanner;
public class descending_array
{
    static void sort(int n,int a[])
    {
        for( int i=0;i<n;i++)
        {
            for( int j=i+1;j<n;j++)
            {
                if(a[i]<a[j])
                {
                   int t=a[i];
                    a[i]=a[j];
                    a[j]=t;
                }
            }
            System.out.print(a[i]+" ");
        }
        
    }
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a[]=new int[n];
		for( int i=0;i<n;i++)
		a[i]=s.nextInt();
		sort(n,a);
	}
	
}
