public class CheckSubString {
   public static void main(String[] args) {
	String sampleString = "HelloWorld";
	String subStringToCheck = "World";
	if(sampleString.contains(subStringToCheck)) {
		System.out.println(subStringToCheck + " is a substring of "+sampleString);
	} else {
		System.out.println(subStringToCheck + " is not a substring of "+sampleString);
	}
   }
}