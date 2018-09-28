package ArraysAndStrings;

public class StringRotation {

	public static void main(String[] args) {
		
		String test1 = "waterbottle";
		String test2 = "erbottlewat";
		
		String test2twice = test2 + test2;
		
		if(isSubstring(test1, test2twice))
			System.out.println("Rotation");
		else
			System.out.println("No Rotation");
		

	}
	
	public static boolean isSubstring(String w1, String w2) {
		return true;
	}

}
