//User function Template for Java

class Solution{
    public static int kthSmallest(int[] arr, int l, int r, int k) 
    { 
        //Your code here
        if (arr == null || arr.length < k)
        {
            return -1;
        }
        return quickSelect(arr, 0, arr.length - 1, k);
    } 
    private static int quickSelect(int[] arr, int left, int right, int k) {
        int pivot = arr[(left + right) / 2];
        int i = left, j = right;
        while (i <= j) {
            while (arr[i] < pivot) {
                i++;
            }
            while (arr[j] > pivot) {
                j--;
            }
            if (i <= j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
        if (k - 1 <= j)
        {
            return quickSelect(arr, left, j, k);
        } else if (k - 1 >= i)
        {
            return quickSelect(arr, i, right, k);
        } else 
        {
            return arr[j + 1];
        }
    }
}

