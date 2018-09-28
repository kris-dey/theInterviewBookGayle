package ArraysAndStrings;

import java.util.HashMap;

public class isUnique1 {

	public static void main(String[] args) {
		
		HashMap<Character, Integer> hMap = new HashMap<Character, Integer>();
		
		String test = "eghjk";
		
		int size = test.length();
		boolean unique = true;
		
		for(int i=0; i<size && unique; i++) {
			if( !hMap.containsKey(test.charAt(i)))
				hMap.put(test.charAt(i), 1);
			else	
				unique = false;
		}
		
		if(unique) System.out.println("It's unique");
		else	System.out.println("Not Unique");
	}

}
