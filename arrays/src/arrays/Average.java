package arrays;

public class Average {

	public static void main(String[] args) {
		
	int a[]= {10,20,30,40,50};
	
	double avg=0;
	System.out.println("average of numbers: ");
	for (int i=0;i<a.length;i++)
	{
	    avg=avg+a[i];
	}
	System.out.print(avg/a.length);
	
}
}

