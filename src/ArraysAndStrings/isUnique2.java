package ArraysAndStrings;

import java.util.Arrays;

public class isUnique2 {
	
	public static void main(String[] args) {
		String test = "qwertyueiop";
		char[] arrayTest = test.toCharArray();
		Arrays.sort(arrayTest);
		
		boolean unique = true;
		int size = arrayTest.length;
		for(int i=0; i<size-1 && unique; i++) 
			if(arrayTest[i]==arrayTest[i+1])	
				unique = false;
		
		if(unique) System.out.println("Unique");
		else System.out.println("Not Unique");
	
	}
}
