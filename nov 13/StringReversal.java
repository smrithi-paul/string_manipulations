public class StringReversal {
   public static void main(String[] args) {
	String sampleString = "AndroidStudio";
	String resultedString = "";
	System.out.println("Given String: "+sampleString);

	//reversal using Iteration
	for(int i=(sampleString.length()-1);i>=0;i--) {
	    resultedString=resultedString+sampleString.charAt(i);
	}
	System.out.println("Reversed String: "+resultedString);
  }
}