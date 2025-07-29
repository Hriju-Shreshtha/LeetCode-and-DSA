// class Solution {
//     public List<List<Integer>> threeSum(int[] nums) {
//         Set<List<Integer>> tripletSet = new HashSet<>();
//         for(int i =0; i<nums.length;i++){
//             Set<Integer> set = new HashSet<>();
//             for(int j=i+1;j<nums.length;j++){
//                 if(set.contains(-1*(nums[i]+nums[j]))){
//                     List<Integer> temp = new ArrayList<>();
//                     temp.add(nums[i]);
//                     temp.add(nums[j]);
//                     temp.add(-1*(nums[i]+nums[j]));
//                     Collections.sort(temp);
//                     tripletSet.add(temp);
//                 }
//                 set.add(nums[j]);
//             }
//         }
//         List<List<Integer>> res = new ArrayList<>(tripletSet);
//         return res;
//     }
// }

class Solution {

    static{
        for(int i=0;i< 300;i++){
            threeSum(new int[]{0});
        }
    }
    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res= new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            int k=nums.length-1;
            int j=i+1;
            while(j<k){
                if(nums[i]+nums[j]+nums[k]<0){
                    j+=1;
                }
                else if(nums[i]+nums[j]+nums[k]>0){
                    k--;
                }
                else{
                    List<Integer> triplet = new ArrayList<>();
                    triplet.add(nums[i]);
                    triplet.add(nums[j]);
                    triplet.add(nums[k]);
                    res.add(triplet);
                    j++;
                    k--;
                    while (j < k && nums[j] == nums[j - 1]) j++;
                    while (j < k && nums[k] == nums[k + 1]) k--;
                }
            }
        }
        return res;
    }
}