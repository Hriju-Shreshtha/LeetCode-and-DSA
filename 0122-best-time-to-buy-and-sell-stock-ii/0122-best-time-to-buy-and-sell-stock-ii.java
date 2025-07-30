class Solution {
    public int maxProfit(int[] prices) {
        int minPrice=Integer.MAX_VALUE, maxProfit=0;

        for(int price: prices){
            if(price<minPrice){
                minPrice=price;
                continue;
            }
            // minPrice=Math.min(price,minPrice);
            // if(price>=minPrice){
                maxProfit+= price-minPrice;
                minPrice=price;
            // }
        }
        return maxProfit;
    }
}

