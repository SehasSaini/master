
public class SubSequenceString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="abc"; 
		String t="ahxgdc";
		
		
		int tracks=0;
		int stracks=0;
		
		while( tracks<t.length())
		{
			if(stracks==s.length())
				System.out.print("its found in string");
			else if(s.charAt(stracks)==t.charAt(tracks))
			
				stracks++;
				
			tracks++;
		
		}
		

	}

}
