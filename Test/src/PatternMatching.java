
public class PatternMatching {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String txt="ABCABCDABC";
		String pattern="ABCD";
		int m=0;
		int j=0;
		for(int i=0;i<=txt.length()-pattern.length();i++)
		{
			for(j=0;j<pattern.length();j++)
                  {
                	 if( txt.charAt(i+j)!=pattern.charAt(j))
                	 {
                		 break;
                	 }
                	  m++;
                  }
			if(j==pattern.length())
			System.out.println("Find the index at "+i);
		}

	}

}
