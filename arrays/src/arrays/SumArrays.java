package arrays;

public class SumArrays {

	public static void main(String[] args) {
		int a[]= {10,20,30};
		int sum=0;
		System.out.println("sum of array elememts");
		for (int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		System.out.print(sum);
		
	}
}
