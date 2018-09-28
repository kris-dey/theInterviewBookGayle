package ArraysAndStrings;

public class URLify {

	public static void main(String[] args) {
		String test = "qwert yuiop  ";
		int size = test.length();
		int actualSize = 11;
		
		char[] t = test.toCharArray();
		
		for(int i = actualSize-1, pt = size-1; i>=0; i--, pt--) {	
			if(t[i]==' ') {
				t[pt--] = '0'; 
				t[pt--] = '2'; 
				t[pt] = '%'; 
			}else {
				t[pt] = t[i];
			}
		}
		System.out.println(t);
	}

}
