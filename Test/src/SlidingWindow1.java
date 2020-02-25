
public class SlidingWindow1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {1,4,20,3,10,5};
         int e=0;
         int s=0;
         int currentSum=a[0];
        
		int val=33;
		for( e=1;e<a.length;e++)
		{
			while(s<e && currentSum>val)
			{
				currentSum-=a[s];
				s++;
				
			}
			
			if(currentSum<val)
				currentSum+=a[e];
			if(currentSum==val)
				System.out.print("Sum is found");
			
		}
				

	}

}
