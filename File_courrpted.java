import java.util.*;

public class File_corrupted{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a[]=new int[n];
		for(int i=0; i<n; i++)
		{
			a[i]=s.nextInt();
		}
		int target=1;
		int found=-1;
		int left=0;
		int right=a.length-1;
		int flag=0;
		while(left<=right) {
			int mid=((left+right)/2);
			if(target==a[mid])
			{
				flag=1;
				found=mid;
				break;
			}
			else if(a[mid]>target)
			{

				right=mid-1;
			}
			else {
				left=mid+1;
			}
		}
		if(flag==1) {
			System.out.print("File corrupted at "+found);
		}
		else {
			System.out.print("not found");
		}
	}
}