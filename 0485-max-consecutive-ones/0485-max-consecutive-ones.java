// class Solution {
//     public int findMaxConsecutiveOnes(int[] nums) {
//         int max=0;
//         int count=0;
//         for(int num : nums){
//             if(num==1){
//                 count++;
//                 max = Math.max(max, count);
//             }
//             else{
//                 // max = Math.max(max, count);
//                     count=0;
//             }
//             // max = Math.max(max, count);
//         }
//         return max;
//     }
// }

class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0, count = 0;
        for (int num : nums) {
            count = (num == 1) ? count + 1 : 0;
            max = Math.max(max, count);
        }
        return max;
    }
}
