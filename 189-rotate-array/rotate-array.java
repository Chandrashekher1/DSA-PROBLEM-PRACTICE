class Solution {
    public void rotate(int[] nums, int k) {
         int n = nums.length;
        k = k % n;
        rotatedArray(nums,k,n);
    }
    
    public void rotatedArray(int[] arr, int k, int n){
        reverseArray(arr,0,n-1);
        reverseArray(arr,0,k-1);
        reverseArray(arr,k ,n-1);
        
    }
    
    public void reverseArray(int[] arr, int start, int end){
        while(start<=end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            
            start++;
            end--;
        }
    }
}