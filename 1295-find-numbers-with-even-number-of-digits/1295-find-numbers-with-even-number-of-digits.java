class Solution {
    public int findNumbers(int[] nums) {
        int count =0;
        for(int each: nums){
            if (((int) (Math.log10(each))) % 2 == 1){
                count++;
            }
        }
        return count;
    }
}