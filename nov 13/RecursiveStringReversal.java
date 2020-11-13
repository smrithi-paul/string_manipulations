public class RecursiveStringReversal {
public static void main(String[] args)  {
	String sampleString = "AndroidStudio";
	System.out.println("Given String: "+ sampleString);
	recursiveReversal(sampleString);
}

static void recursiveReversal(String str)  {
	if(str.length()>0) {
		System.out.println(str.charAt(str.length()-1));
		recursiveReversal(str.substring(0,str.length()-1));
	}
}
}

