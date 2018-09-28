package ArraysAndStrings;

public class StringCompression {

	public static void main(String[] args) {
		String test = "abca";
		
		StringBuilder compressed = new StringBuilder();	
		
		int i = 0, j = 0, occurence = 0;
		int size = test.length();
		boolean loop = true, compression = false;
		while(loop) {
			if(i+1==size) loop=false;
			
			occurence = 0;
			j = i;
			while(test.charAt(i)==test.charAt(j) && loop) {
				occurence++;
				if(j+1!=size) j++;
				else loop = false;
			}
			
			compressed.append(test.charAt(i));
			compressed.append(occurence);
			
			if(!compression && occurence > 1) compression = true;
			
			i = j;
		}
		
		if(compression) System.out.println(compressed);
		else	System.out.println("No compression possible: "+test);
		
	}

}
