
//User function Template for Java
class Solution{
    static List<Integer> leftSmaller(int n, int a[])
    {
        //code here
        ArrayList<Integer> res = new ArrayList<>();
        //traverse each element in array
        for(int i=0; i<a.length; i++){
            int prev = -1;
            //traverse left side elements of current element
            for(int j=i-1; j>=0; j--){
                if(a[j]<a[i]){
                    prev = a[j];
                    break;
                }
            }
            res.add(prev);
        }
        return res;
    }
}