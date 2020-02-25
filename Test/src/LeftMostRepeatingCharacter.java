import java.util.LinkedHashMap;
import java.util.Map;

public class LeftMostRepeatingCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="abddb";
		Map <Character,Integer> map=new LinkedHashMap<Character,Integer>();
		for(int i=0;i<str.length();i++)
		{
			if(map.containsKey(str.charAt(i)))
				map.put(str.charAt(i), map.get(str.charAt(i))+1);
			else
				map.put(str.charAt(i), 1);
		}
		
		for(Map.Entry<Character, Integer> hm:map.entrySet())
		{
			if(hm.getValue()>1)
			{
				System.out.print(hm.getKey());
				break;
			}
		}
	}

}
