class Solution {
    public void rotate(int[] nums, int k) {
        k=k%nums.length;
        int n= nums.length;
        // ********RIGHT ROTATING***** an array k time is equal to reversing the array entirely then reversing the first k elements of the array then reversing the rest of the array elements
        rev(nums,0, n-1);
        rev(nums,0,k-1);
        rev(nums,k,n-1);


        // ********LEFT ROTATING***** an array k time is equal to reversing the array entirely then reversing the first N-k elements of the array then reversing the rest of the array elements
    //     rev(nums,0, n-1);
    //     rev(nums,0,n-k-1);
    //     rev(nums,n-k,n-1);
    }

    public static void rev(int [] nums,int start,int end){
        while(start<=end){
            int temp = nums[start];
            nums[start]=nums[end];
            nums[end]= temp;
            start++;
            end--;
        }
        return;
    }
}