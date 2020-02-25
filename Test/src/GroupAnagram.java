import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <List<String>> grpAnagram=new ArrayList();
	String str[]= {"eat", "tea", "tan", "ate", "nat", "bat"};
		
		Map<String, List<String>> map=new HashMap<String,List<String>>();
		for(String X:str)
		{
			char a[]=X.toCharArray();
			Arrays.sort(a);
			String sorted=new String(a);
			if(!map.containsKey(sorted))
			map.put(sorted, new ArrayList<String>());
			
				map.get(sorted).add(X);
			
		}
		
		grpAnagram.addAll(map.values());
System.out.println(grpAnagram);
	}

}
