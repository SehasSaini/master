
public class PermutationOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String st="ab";
		String fixed="";
		String unused="ab";
		permutation(fixed, unused);

	}

	static void permutation(String fixed, String unused)
	{
		if(unused.length()==0)
		{
			String str="eidboaoo";
		    if(str.contains(fixed))
		    	System.out.println("yes it conatins");
			
		}
			//System.out.println(fixed);
		
		for(int i=0;i<unused.length();i++)
		permutation(fixed+unused.charAt(i),unused.substring(0,i)+unused.substring(i+1));
		
	}
}
