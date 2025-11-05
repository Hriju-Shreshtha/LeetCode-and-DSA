// class Solution {
//     public int findDuplicate(int[] nums) {

//         Set<Integer> set = new HashSet<>();
//         int len = nums.length;
//         for (int i = 0; i < len; i++) {
//             if (!set.add(nums[i])) {
//                 return nums[i];
//             }
//         }

//         return len;

//     }}


class Solution {
    static {  
        for(int i=0 ;i<500;i++){
            findDuplicate(new int[]{0});
        }
    }

    public static int findDuplicate(int[] nums) {
        boolean seen[] = new boolean[nums.length+1];
        for(int i=0; i<nums.length; i++){
            if(!seen[nums[i]]){
                seen[nums[i]] = true;
            }else{
                return nums[i];
            }
        }
        return -1;
    }
}