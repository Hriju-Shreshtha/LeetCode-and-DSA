// ------------------------------------------------------------------------------------------------------------------------

// CYCLIC SORT 

class Solution {
    public static int missingNumber(int[] arr) {

        // List<Integer> ans = new ArrayList<Integer>();
        int i=0;
        while(i<arr.length){
            int correct = arr[i];
            if (arr[i] < arr.length && arr[i] != arr[correct]){
                swap(arr, i, correct);
            }
            else{
                i++;
            }
        }

        for(int j=0; j<arr.length; j++){
            if (arr[j]!= j){
                return j;
            }
        }

        return arr.length;
    }


    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}

// class Solution {
//     public int missingNumber(int[] nums) {
//         int n=nums.length;
//         int sum=(n*(n+1))/2;
//         for(int i=0;i<n;i++)
//         {
//             sum-=nums[i];
//         }
//         return sum;
//     }
// }