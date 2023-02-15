
class Solution
{ 
    public static int findSum(int A[],int N) 
    {
        //code here
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<N;i++){
          max = Math.max(max,A[i]);
          min = Math.min(min,A[i]);
        }
        int sum = ( max + min);
        return sum;
    }
}
