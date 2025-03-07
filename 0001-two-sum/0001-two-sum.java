class Solution {
    public int[] twoSum(int[] nums, int target) {
         Map<Integer, Integer> complements = new HashMap<>();
        for(int i= 0; i < nums.length; i++ ){
            Integer complementIndex = complements.get(nums[i]); // we are using the wrapper class as we cannot perform the null check with the integer datatype and we cannot use the default value to check if the complement exists as 0 might be a possible solution.
            if(complementIndex != null){
                return new int []{i, complementIndex};
            }
             complements.put(target-nums[i],i);
        }
        return nums;
        
}
}