
public class AnagramString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1="a";
		String str2="b";
		
		int count[]= new int[256];
		for(int i=0;i<str1.length();i++)
		{
		//	System.out.println(count[str1.charAt(i)]);
			count[str1.charAt(i)]++;
		}
		
		for(int i=0;i<str2.length();i++)
		{
			count[str2.charAt(i)]--;
		}
		int a=0;
		for(int i=0;i<256;i++)
		{
		//	System.out.println(count[i]);
			if(count[i]!=0)
			{
				a++;
				System.out.println("Not anagram");
				break;
			}
		
			
		}
		if(a==0)
		System.out.println("Anagram");
	}

}
