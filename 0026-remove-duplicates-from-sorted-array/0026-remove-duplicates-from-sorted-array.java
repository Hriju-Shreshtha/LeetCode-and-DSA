class Solution {

    static{
        for(int i =0;i<100;i++)
        removeDuplicates(new int[]{0,0});
    }
    public static int removeDuplicates(int[] nums) {
        int j = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }
}