public class NonRepeatingString {
     public static void main(String[] args) {
  	String str = "Java is Object Oriented";
  	boolean unique;
          
        //Converts given string into character array  
        char charArray[] = str.toCharArray();  
          
        System.out.println("Given string: "+str);  
        //Counts each character present in the string  
        for(int i = 0; i <str.length(); i++) {  
            unique = true;
            for(int j = i+1; j <str.length(); j++) {  
		//comparing each character 
                if(charArray[i] == charArray[j] && charArray[i] != ' ') {  
                    unique = false;
		    break;
                }  
            } 
	//A character is considered as unique if it is true  
            if(unique)  
                System.out.println("First non repeating character in a string is "+charArray[i]);   
        	break;
	}  
    }  
 }


