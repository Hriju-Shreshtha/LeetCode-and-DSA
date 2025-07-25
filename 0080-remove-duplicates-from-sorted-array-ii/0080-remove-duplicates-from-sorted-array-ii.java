// GENERALIZED SOLUTION FOR K DUPLICATES ALLOWED



class Solution {
    public int removeDuplicates(int[] nums) {
        int k=2;
        if (nums.length <= k)
            return nums.length;

        int index = k;

        for (int i = k; i < nums.length; i++) {
            if (nums[i] != nums[index - k]) {
                nums[index] = nums[i];
                index++;
            }
        }

        return index;
    }
}



// Hriju Solution

// class Solution {
//     public int removeDuplicates(int[] nums) {

//         if (nums.length <= 2)
//             return nums.length;
//         int j=2;
//         for(int i=2; i<nums.length;i++){
//             if (nums[i]!=nums[i-1]){
//                 nums[j]=nums[i];
//                 j++;
//             }
//             else{
//                 if(nums[j-1]!=nums[j-2]){
//                     nums[j]=nums[i];
//                     j++;
//                 }
//             }
//         }
//         System.out.println(j);
//         return j;
//     }
// }