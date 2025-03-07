class Solution {
    public int romanToInt(String s) {
       
        int total = 0;
        for(int i = 0; i< s.length();i++)
        {
            
           int S1 = value(s.charAt(i));
            if(i+1<s.length()){
            int S2 = value(s.charAt(i+1));
            if(S1>= S2){
                total= total+S1;
            }
            else
            total = total-S1;
            }
            else 
            total= total+S1;
        }
        return total;
        
    }
     public int value(char a){
            if (a == 'I')
                return 1;
            else
            if (a == 'V')
                return 5;
            else
                if (a == 'X')
                return 10;
            else
                if (a == 'L')
                return 50;
            else
                if (a == 'C')
                return 100;
            else
                if (a == 'D')
                return 500;
            else if (a == 'M')
                return 1000;
         return -1;
        }
}