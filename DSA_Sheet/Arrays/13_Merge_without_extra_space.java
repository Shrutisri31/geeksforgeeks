
//User function Template for Java

class Solution
{
    //Function to merge the arrays.
    public static void merge(long arr1[], long arr2[], int n, int m) 
    {
        //code here
    // OPTIMAL APPROACH 1  
        int left = n - 1;
        int right = 0;
        while ( left >= 0 && right < m){
            if(arr1[left] > arr2[right]){
                long temp = arr1[left];
                arr1[left] = arr2[right];
                arr2[right] = temp;
                left--;
                right++;
            }
            else{
                break;
            }
        }
        
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        
    //BRUTE FORCE APPROACH  
        long res[] = new long[n + m];
        int left = 0;
        int right = 0;
        int k = 0;
        while(left < n && right < m){
            if(arr1[left] <= arr2[right]){
                res[k++]= arr1[left++];
                
            }
            else{
                res[k++] = arr2[right++];
            }
        }
        
        while ( left < n){
            res[k++] = arr1[left++];
        }
        while (right < m){
            res[k++] = arr2[right++];
        }
        
        //reshuffling back into original arrays
        for(int i=0; i< n+m; i++){
            if(i < n){
                arr1[i] = res[i];
            }
            else{
                arr2[i-n] = res[i];
            }
        }
    }
}