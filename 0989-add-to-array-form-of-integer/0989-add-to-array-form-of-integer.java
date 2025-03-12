// class Solution {
//     public List<Integer> addToArrayForm(int[] num, int k) {
//         long first=0;
//         List<Integer> ans = new ArrayList<>();
//         for(int dig : num){
//             first= first*10 +dig;
//             System.out.println(first);
//         }
//         // System.out.println(first);
//         long sum = first+k;
//         System.out.println(sum);
//         // int len= ((int)Math.log10(sum))+1;
//         // System.out.println(len);
//         // long a =sum%10;
//         // int b = (int) a;
//         // System.out.println((int)sum%10);
//         // System.out.println(b);
//         while(sum>0){
//             long a =sum%10;
//             int b = (int) a;
//             ans.add(0,b);
//             sum=sum/10;
//         }
//         return ans;
//     }
// }

class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        int len = num.length;
        List<Integer> ans= new ArrayList<>();
        int carry=0;
        while(len>0){
            int sum= k%10 +num[len-1]+carry;
            carry=0;
            if(sum>9){
                carry=sum/10;
                sum=sum%10;
            }
            ans.add(0,sum);
            len--;
            k=k/10;
        }
        if (k>0){
            k=k+carry;
            carry =0;
            while(k>0){
                ans.add(0,k%10);
                k=k/10;
            }
        }
        if(carry>0){
            ans.add(0,carry);
        }
        return ans;
    }
}