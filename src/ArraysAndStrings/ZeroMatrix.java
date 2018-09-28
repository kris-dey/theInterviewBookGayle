package ArraysAndStrings;

import java.util.Arrays;

public class ZeroMatrix {

	public static void main(String[] args) {
		
		int[][] test = {
							{1,2,3},
							{1,0,1},
							{0,1,2}
						};
		
		int rowSize = test.length;
		int columnSize = test[0].length;
		
		
		boolean[] rowNull= new boolean[rowSize];
		boolean[] columnNull= new boolean[columnSize];
		
		for(int i = 0; i<rowSize; i++) {
			for(int j = 0; j<columnSize; j++ ) {
				if(test[i][j]==0) {
					rowNull[i] = true;
					columnNull[j] = true;
				}
			}
		}
		
		for(int i=0;i<rowSize;i++) {
			if(rowNull[i])
				for(int j=0;j<columnSize;j++)
					test[i][j] = 0;
		}
		
		for(int i=0;i<columnSize;i++) {
			if(columnNull[i])
				for(int j=0;j<rowSize;j++)
					test[j][i] = 0;
		}
		
		String a = Arrays.deepToString(test);
		
		System.out.println(a);
		

	}

}
