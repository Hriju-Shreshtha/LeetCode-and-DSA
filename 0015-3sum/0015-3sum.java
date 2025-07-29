class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> tripletSet = new HashSet<>();
        for(int i =0; i<nums.length;i++){
            Set<Integer> set = new HashSet<>();
            for(int j=i+1;j<nums.length;j++){
                if(set.contains(-1*(nums[i]+nums[j]))){
                    List<Integer> temp = new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(nums[j]);
                    temp.add(-1*(nums[i]+nums[j]));
                    Collections.sort(temp);
                    tripletSet.add(temp);
                }
                set.add(nums[j]);
            }
        }
        List<List<Integer>> res = new ArrayList<>(tripletSet);
        return res;
    }
}