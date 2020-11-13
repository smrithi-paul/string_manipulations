public class ReverseWords {
private static void reverseWords(String sampleString) {
	String[] splittedArray = sampleString.split(" ");
	for(int i=(splittedArray.length-1);i>=0;i--) {
		System.out.println(splittedArray[i]);
	}
}
   public static void main(String[] args) {
	String sampleString = "Java is Object Oriented";
	reverseWords(sampleString);
  }	
}
