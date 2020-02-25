
public class SubSetOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String st="abc";
	   String curr="";
		subsets(st,0,"");
		
		

	}

 static void subsets(String str,int index, String curr)
	{
	 
	 if(index==str.length())
		 System.out.println(curr);
	 else
	 {
	   subsets(str,index+1,curr+str.charAt(index));
	   subsets(str,index+1,curr);
	 }
		
	}
}
