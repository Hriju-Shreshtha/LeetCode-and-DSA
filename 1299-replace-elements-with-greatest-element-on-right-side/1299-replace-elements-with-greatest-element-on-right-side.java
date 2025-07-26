class Solution {
    public int[] replaceElements(int[] nums) {
        int max = nums[nums.length - 1];
        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] > max) {
                int temp = max;
                max = nums[i];
                nums[i] = temp;
            } else {
                nums[i] = max;
            }
        }
        nums[nums.length - 1] = -1;
        return nums;
    }
}
