class Solution {
    public int lengthOfLastWord(String s) {
        
        int j=0;
        int k=s.length()-1;
   
        if(s.charAt(k)==' '){
            while(s.charAt(k)==' '){
                  k--;
            }
        }

        //  if(s.length()==1){
        //     return 1;
        // }


        for(int i=k;i>=0;i--){
                if(s.charAt(i)==' '){
                       break;
                }   
                j++;
        }

        return j;
    }
}