import java.util.* ;
import java.io.*; 

public class Solution {
	public static int[] wavePrint(int arr[][], int nRows, int mCols) {
		// Write your code here.
	   int ans[] = new int[nRows*mCols];
		int i=0;
		for(int col=0; col<mCols; col++){

			if(col%2==0){
				//even index - top to bottom
				for(int row=0; row<nRows; row++){
					//System.out.println(arr[row][col]);
					ans[i] = arr[row][col];
					i++;
				}
				
			}
			else{
				//odd index - bottom to top
				for(int row=nRows-1; row>=0; row--){
					//System.out.println(arr[row][col]);
					ans[i]=arr[row][col];
					i++;
				}
				
			}
		}
		return ans;
	}
}


