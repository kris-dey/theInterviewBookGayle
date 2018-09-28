package ArraysAndStrings;



public class OneAway {

	public static void main(String[] args) {
		
		String test1 = "pale";
		String test2 = "bake";
		
		int size1 = test1.length();
		int size2 = test2.length();
		int lengthDiff = Math.abs(size1-size2);
		
		if(lengthDiff>1) {
			System.out.println("Not 1 away");
		} else {
			
			int difference = 0;
			
			char[] t1 = test1.toCharArray();
			char[] t2 = test2.toCharArray();
			
			if(size2>size1) swap(t1,t2);
			
			if(lengthDiff==1) {
				for(int i=0, j=0; i<size1; i++, j++) {
					if(j+1==size2 && t1[i]!=t2[j]) {
						difference++;
						if(i+1!=size1) i++;
					}
				}
			}else {
				for(int i=0; i<size1; i++)
					if(t1[i]!=t2[i]) difference++;
			}
			
			if(difference>1) System.out.println("Not 1 away");
			else	System.out.println("1 away");
			
		}
	}
	
	public static void swap(char[] t1, char[] t2) {
		char[] tmp = t1;
		t1 = t2;
		t2 = tmp;
	}

}
