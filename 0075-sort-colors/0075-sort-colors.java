class Solution {
    public void sortColors(int[] nums) {
        int a=0,b=nums.length-1,i=0;
        while(i<=b){
            if(nums[i]==0){
                swap(nums,a, i);
                a++;
                i++;
            }
            else if(nums[i]==2 ){
                swap(nums,b,i);
                b--;
            }
            else {
                i++;
            }
        }
    }
    public void swap(int [] nums,int a,int b){
        int temp=nums[a];
        nums[a]=nums[b];
        nums[b] = temp;
    }
}