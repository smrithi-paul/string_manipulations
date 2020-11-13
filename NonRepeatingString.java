import java.util.LinkedHashMap; 
import java.util.Map; 
import java.util.Set;

public class NonRepeatingString {
     public static void main(String[] args) {
  	String str = "Java is Object Oriented";

        //Converts given string into character array  
        char charArray[] = str.toCharArray();            
          
        System.out.println("Given string: "+str);  

        //create a hashmap
	Map<Character, Integer> charMap = new LinkedHashMap<Character, Integer>();
	//loop each characters and put to hashmap with no:of times duplicate occurred
	for(Character ch: charArray) {
		if(charMap.containsKey(ch)) {
			charMap.put(ch, charMap.get(ch)+1);
		} else {
			if(!(ch==' ')) { 
				charMap.put(ch,1);
			}
		}
	}        

	//Print hashMap with duplicates
	System.out.println("First non repeated character is: ");
	for(Map.Entry<Character,Integer> charEntry : charMap.entrySet()) {
		if(charEntry.getValue()==1) {
			System.out.println(charEntry.getKey());
			break;
		}
	} 
    }  
 }
