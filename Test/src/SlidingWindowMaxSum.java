
public class SlidingWindowMaxSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {1,2,3,1,4,5};
		int currentSum=0;
		int windowSize=3,i=0;
		for(i=0;i<windowSize;i++)
		{
			currentSum+=a[i];
		}
		int maxSum=currentSum;
		
		for(i=windowSize;i<a.length;i++)
		{ 
			
		currentSum=	currentSum+a[i];
		currentSum=currentSum-a[i-windowSize];
		if(currentSum>maxSum)
			
			maxSum=currentSum;
		}
		System.out.print("max sum :"+maxSum);
	}

}
