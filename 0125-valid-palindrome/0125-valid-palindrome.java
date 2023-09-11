class Solution {
    public boolean isPalindrome(String s) {
       return Palindrome(s);
    }

    public static boolean Palindrome(String str){
            str= str.toLowerCase().replaceAll("[^A-Za-z0-9]", "");
            int i=0;
            int j=str.length()-1;

            while(i<=j){
                 if(str.charAt(i)!=str.charAt(j)){
                      return false;
                 }

                 i++;
                 j--;
            }


            return true;
    }
}