class Solution {
    public boolean isPalindrome(String s) {


        StringBuffer str = new StringBuffer("");

        for(int i =0;i<s.length();i++){
            if((s.charAt(i)>=65&&s.charAt(i)<=90)||(s.charAt(i)>=97&&s.charAt(i)<=122)||(s.charAt(i)>=48&&s.charAt(i)<=57)) str.append(s.charAt(i));
        }
        

        String str1 = str.toString().toLowerCase();

        for(int i = 0;i<str1.length();i++){
            if(str1.charAt(i)!=str1.charAt(str1.length()-i-1))return false;
        }

        return true;

        
    }
}
