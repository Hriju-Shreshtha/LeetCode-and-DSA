class Solution {
    public boolean checkIfPangram(String sentence) {
        boolean ans = true;
        for(int i=0;i<26;i++){
            if(!sentence.contains(String.valueOf((char)('a'+i)))){
                ans=false;
                break;
            } 
        }
        return ans;
    }
}