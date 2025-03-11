class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count=0;
        if (ruleKey.equalsIgnoreCase("type")){
            for(List<String> elements: items){
                if(elements.get(0).equalsIgnoreCase(ruleValue)){
                    count++;
                }
            }
        }
        else if (ruleKey.equalsIgnoreCase("color")){
            for(List<String> elements: items){
                if(elements.get(1).equalsIgnoreCase(ruleValue)){
                    count++;
                }
            }
        }
        else if (ruleKey.equalsIgnoreCase("name")){
            for(List<String> elements: items){
                if(elements.get(2).equalsIgnoreCase(ruleValue)){
                    count++;
                }
            }
        }
        return count;
    }
}