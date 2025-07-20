import java.util.*;
class Solution {
    public int[] transformArray(int[] nums) {
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){   // check the number is even 
                nums[i] = 0;    // store 0 in their index
            }else{
                nums[i] = 1;   // if the number is odd then store 1 in the index
            }
        }
        Arrays.sort(nums);  // sort the array
        return nums;        // return the array
    }
}