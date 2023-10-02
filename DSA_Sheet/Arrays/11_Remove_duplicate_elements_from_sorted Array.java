class Solution {
    int remove_duplicate(int A[],int N){
        // code here
        int i = 0;
        for(int j=1; j<A.length; j++){
            if(A[i] != A[j]){
                A[i+1] = A[j];
                i++;
            }
        }
        return i+1;
    }
}