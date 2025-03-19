class Solution {
    public int numberOfSteps(int num) {
        int count = steps(num,0);
        return count;
    }
    public int steps(int n,int count){
        if(n==0)
        return count;

        if(n%2==0){
            return steps(n/2,count+1);
        }
        else{
           return steps(n-1,count+1);
        }
    }
}