class Solution {
    public boolean isPalindrome(String s) {
        String sp="";
        s=s.toLowerCase();
        for(int i=0;i<s.length();i++){
            if((s.charAt(i)>=97 && s.charAt(i)<=122) || (s.charAt(i)>=48 && s.charAt(i)<=57))
            sp+=s.charAt(i);
        }
        //System.out.println(sp);
     for(int i=0;i<sp.length()/2;i++){
           if(sp.charAt(i)!=sp.charAt(sp.length()-1-i))
               return false;
        }
        return true;
    }
}