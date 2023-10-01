class Solution 
{
    //Function to reverse words in a given string.
    String reverseWords(String S)
    {
        // code here 
        int i = S.length()-1;
        String ans = "";
        while(i>=0){
            while(i>=0 && S.charAt(i) == '.'){
                i--;
            }
            int j=i;
            while(i>=0 && S.charAt(i) != '.'){
                i--;
            }
            if(ans.isEmpty()){
                ans = ans.concat(S.substring(i+1,j+1));
            }
            else{
                ans = ans.concat("."+S.substring(i+1,j+1));
            }
        }
        return ans;
    }
}