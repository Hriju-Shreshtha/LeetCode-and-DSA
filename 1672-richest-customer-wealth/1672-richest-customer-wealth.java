class Solution {
    public int maximumWealth(int[][] accounts) {
        int wealth = 0;
        
        for(int i=0;i<accounts.length;i++){
            int max=0;
            for(int j=0;j<accounts[0].length;j++){
                max=max+accounts[i][j];
            }
            if(max>wealth){
                wealth=max;
            }
        }
        return wealth;
    }
}