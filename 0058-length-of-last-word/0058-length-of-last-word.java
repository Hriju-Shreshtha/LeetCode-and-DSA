class Solution {
    public int lengthOfLastWord(String s) {
        s=s.trim();
        int index=0;
        for(int i=s.length()-1; i>=0;i--){
            if(i==0){
                index =-1; //this has no logic just brute force- redo this with proper logic
                break;
            }
            if(s.charAt(i)==' '){
            index=i;
            break;
            }
        }
        return s.length()-index-1;
    }
}