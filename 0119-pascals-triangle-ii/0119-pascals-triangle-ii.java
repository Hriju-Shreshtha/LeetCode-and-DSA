class Solution {
    // public List<Integer> getRow(int r) {
    //     List<Integer> res= new ArrayList<>();
        
    // }

    public List<Integer> getRow(int r){
        List<Integer> res= new ArrayList<>();
        res.add(1);
        long num=1;
        for(int i=1;i<=r;i++){
            num=num*(r-i+1)/i;
            res.add((int)num);
        }
        return res;
    }
}