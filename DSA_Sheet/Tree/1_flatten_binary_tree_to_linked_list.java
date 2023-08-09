class Solution
{
    public static void flatten(Node root)
    {
        //code here
        //base case
        if(root == null || root.left == null && root.right == null){
            return;
        }
        if(root.left != null){
            flatten(root.left);
            Node temp = root.right;
            root.right = root.left;
            root.left = null;
            
            Node t = root.right; //previously root.left
            while(t.right != null)
            {
               t = t.right;
            }
            t.right = temp;
        }
        flatten(root.right);
    }
}
