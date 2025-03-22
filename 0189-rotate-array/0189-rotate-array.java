class Solution {
    public void rotate(int[] nums, int k) {
        k=k%nums.length;

        // rotating array k time is equal to reversing the arrat entirely then reversing the first k elements of the arrar then reversing the rest of the arrat elements
        rev(nums,0, nums.length-1);
        rev(nums,0,k-1);
        rev(nums,k,nums.length-1);
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
