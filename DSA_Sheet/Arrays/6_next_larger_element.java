
class Solution
{
    //Function to find the next greater element for each element of the array.
    public static long[] nextLargerElement(long[] arr, int n)
    { 
        // Your code here
        Stack<Long>  s = new Stack<>();
        long res[] = new long[arr.length];
        for(int i = arr.length-1; i>=0; i--){
            while(!s.isEmpty() && s.peek() <= arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                res[i] = -1;
            }
            else{
                res[i] = s.peek();
            }
            s.push(arr[i]);
        }
        return res;
    } 
}
