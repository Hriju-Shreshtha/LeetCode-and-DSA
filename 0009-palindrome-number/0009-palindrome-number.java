class Solution {
    public boolean isPalindrome(int x) {
        int temp = x, rev= 0;
        while (temp>0){
            rev=rev*10+temp%10;
            temp=temp/10;
        }
        if (rev == x)
        return true;
        else 
            return false;
    }
}