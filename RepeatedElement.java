import java.util.Scanner;
public class RepeatedElement {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int count=0;
		int result=0;
		System.out.println("Enter size of array");
		int n=s.nextInt();
		System.out.println("Enter elements in array");
		int[] a=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(a[i]==a[j] && i!=j)
				{
					result=a[i];
					count=1;
					break;
				}
			
			}
				if(count==1)
				break;
		}
		System.out.println("The repeated element is");
		System.out.println(result);
	}

}
