class Solution {
    public int diagonalSum(int[][] mat) {
        int sum=0;
        // for(int i=0;i<mat.length-1;i++){
        //     for(int j=i; j<mat[0].length-1;j++){
        //         if(i==j){
        //             sum+=mat[i][j];
        //         }
        //     }
        // }
        // for(int i=0;i<mat.length;i++){
        //     for(int j= mat[0].length-1;j>i;j++){

        //     }
        // }
        int i=0;
        int j=0;
        while(i<mat.length){
            sum=sum+mat[i][j];
            i++;j++;
        }
        int seci=0;
        int secj=mat.length-1;
        while(secj>=0){
            sum=sum+mat[seci][secj];
            seci++;
            secj--;
        }
        int len =mat.length;
        if (len%2!=0){
            sum-= mat[len/2][len/2];
        }
        return sum;
    }
}