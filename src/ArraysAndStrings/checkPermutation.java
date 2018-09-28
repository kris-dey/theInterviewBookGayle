package ArraysAndStrings;

import java.util.Arrays;

public class checkPermutation {

	public static void main(String[] args) {
		String test1 = "sefgdf";
		String test2 = "sdfgf";
		
		char[] ch1 = test1.toCharArray();
		char[] ch2 = test2.toCharArray();
		
		int size1 = test1.length();
		int size2 = test2.length();
		if(size1!=size2) {
			System.out.println("Not P");
			return;
		}
		
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		boolean notP = false;
		
		for(int i=0; i<size1 && !notP; i++) {
			if(ch1[i]!=ch2[i]) {
				notP = true;
			}
		}
		
		if(!notP) System.out.println("P");
		else System.out.println("Not P");
	}

}
