class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        perm(res, new ArrayList<Integer>(), nums);
        return res;
    }

    public void perm(List<List<Integer>> res, List<Integer> temp, int []nums){
        if(nums.length==temp.size()){
            res.add(new ArrayList<>(temp));
        }
        else{
            for(int i=0;i<nums.length;i++){
                if(temp.contains(nums[i])) continue;
                temp.add(nums[i]);
                perm(res,temp,nums);
                temp.remove(temp.size()-1);
            }
        }  
    }
}