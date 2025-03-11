class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int [] ans = new int [101];
        for(int i=0;i<nums.length;i++){
            ans[nums[i]]++;
        }

        for(int i=1;i<=100;i++){
            ans[i]= ans[i]+ans[i-1];
        }

        int res[]= new int [nums.length];
        for(int i=0;i<res.length;i++){
            if(nums[i]==0){
                res[i]=0;
            }
            else{
            res[i]= ans[nums[i]-1];
            }
        }
        return res;
    }
}