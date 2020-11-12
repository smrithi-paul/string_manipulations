public class DuplicateStrings {
     public static void main(String[] args) {
  	String str = "Java is Object Oriented";
  	int count;  
          
        //Converts given string into character array  
        char charArray[] = str.toCharArray();  
          
        System.out.println("Duplicate characters in the given string: "+str);  
        //Counts each character present in the string  
        for(int i = 0; i <str.length(); i++) {  
            count = 1;  
            for(int j = i+1; j <str.length(); j++) {  
		//comparing each character 
                if(charArray[i] == charArray[j] && charArray[i] != ' ') {  
                    count++;  
                    //Set charArray[j] to 0 to avoid printing visited character  
                    charArray[j] = '0';  
                }  
            }  
            //A character is considered as duplicate if count is greater than 1  
            if(count > 1 && charArray[i] != '0')  
                System.out.println(charArray[i]+ "  count: "+count);  
        }  
    }  
 }


