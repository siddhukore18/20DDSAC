/// leetcode 1513

class Solution {
    public int numSub(String s) {


        long index = 0,count = 0;


        for(int i = 0 ; i < s.length();i++){
            if(s.charAt(i)=='0') {
                index =i+1;
                continue;
            }else{
                count+=i-index+1;
            }
        }

        return (int)(count%1000000007);

    }
}
