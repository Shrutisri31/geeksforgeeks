//Optimal Approach

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

// brute force Approach 
class Solution {
    int remove_duplicate(int A[],int N){
        // code here
        HashSet<Integer> set = new HashSet<>();
        int index = 0;
        for(int i=0; i<A.length; i++){
            if(!set.contains(A[i])){
                A[index] = A[i];
                index++;
                set.add(A[i]);
            }
        }
        return index;
    }
}