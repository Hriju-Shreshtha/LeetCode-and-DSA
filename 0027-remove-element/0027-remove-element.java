// class Solution {
//     public int removeElement(int[] nums, int val) {

//         int j=nums.length-1;
//         int i=0;
//         while(i<nums.length){
//             if(nums[i]==val){
//                 while(j>0 && j>=i){
//                     if(nums[j]!=val){
//                         swap(i,j, nums);
//                         j--;
//                         // i++;
//                         break;
//                     }
//                     else{
//                         j--;
//                     }
//                 }
//             }
//             i++;
//         }
//         System.out.println(j);
//         System.out.println(Arrays.toString(nums));
//         return nums.length-j+1;
//     }

//     public void swap (int a, int b, int nums []){
//         int temp= nums[a];
//         nums[a] = nums[b];
//         nums[b]= temp;
//     }
// }
class Solution {
    public int removeElement(int[] nums, int val) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[index] = nums[i];
                index++;
            }
        }
        return index;
    }
}