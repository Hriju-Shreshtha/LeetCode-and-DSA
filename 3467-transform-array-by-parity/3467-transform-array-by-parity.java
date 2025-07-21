class Solution {
    public int[] transformArray(int[] nums) {
        int evenCount=0,oddCount=0;
        int arr[]=new int[nums.length];
        int k=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]%2==0)
            {
              evenCount++;
            }
            else
            {
              oddCount++;
            }
        }
        for(int i=1;i<=evenCount;i++)
        {
           arr[k++]=0;
        }
         for(int i=1;i<=oddCount;i++)
        {
           arr[k++]=1;
        }
        return arr;
    }
}