class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max=0;
        List <Boolean> res = new ArrayList<>();
        for(int element : candies ){
            if (element>= max) max= element;
        }

        for (int element : candies){
            if(element+extraCandies>= max) res.add(true);
            else res.add(false);
        }
        return res;
    }
}