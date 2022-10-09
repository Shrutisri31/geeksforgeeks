class Solution
{    
    //Function is to check whether two strings are anagram of each other or not.
    public static boolean isAnagram(String a,String b)
    {
        
        // Your code here
        if(a.length()!=b.length()){
            return false;
        }
        char arr1[]=a.toCharArray();
         char arr2[]=b.toCharArray();
         Arrays.sort(arr1);
         Arrays.sort(arr2);
         return Arrays.equals(arr1,arr2);
    }
} 