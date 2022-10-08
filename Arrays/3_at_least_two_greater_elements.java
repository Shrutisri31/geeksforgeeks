class Solution {
    public long[] findElements( long a[], long n)
    {
        // Your code goes here
       Arrays.sort(a);
       long[] ans = new long[a.length-2];
      for(int i=0;i<ans.length;i++)
      {
          ans[i]=a[i];
      }
       return ans;
}
}
