// class Solution {
//     public int largestAltitude(int[] gain) {
//         for(int i=1;i<gain.length;i++){
//             gain[i]=gain[i]+gain[i-1];
//         }
//         System.out.println(Arrays.toString(gain));
//         int max=Integer.MIN_VALUE;
//         for(int i=0;i<gain.length;i++){
//             if(gain[i]>max)
//             max=gain[i];
//         }
//         if(max<0){
//             return 0;
//         }
//         return max;
//     }
// }
class Solution {
    public int largestAltitude(int[] gain) {
        int n=gain.length;
        int[] arr=new int[n+1];
        for(int i=1;i<arr.length;i++){
            arr[i]=arr[i-1]+gain[i-1];
        }
        int m=0;
        for(int i=0;i<arr.length;i++){
            if(m<arr[i])
                m=arr[i];
        }
        return m;
        
        
    }
}