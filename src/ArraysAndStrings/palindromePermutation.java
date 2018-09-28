package ArraysAndStrings;

import java.util.HashMap;

public class palindromePermutation {

	public static void main(String[] args) {
		
		String test = "Tact Cq";
		
		HashMap<Character, Integer>  hm = new HashMap<Character, Integer>();
		
		char[] t = test.toCharArray();
		int size = t.length;
		
		for(int i=0; i<size; i++) {
			if(t[i]==' ');
			else{ 
				t[i] = Character.toLowerCase(t[i]);
				if(hm.containsKey(t[i])) {
					int occurrence = hm.get(t[i]);
					hm.remove(t[i]);
					hm.put(t[i], ++occurrence);
				} else
					hm.put(t[i], 1);
			}
		}
		
		int odd = 0;
		
		for(char key: hm.keySet()) 
			if(hm.get(key)%2==1)
				odd++;
		
		if(odd>1) System.out.println("N P");
		else	System.out.print("P");

	}

}
