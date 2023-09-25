class Solution {
    public char findTheDifference(String s, String t) {
         int arr[]=new int[26];   
        
        for(char ch:t.toCharArray()){
              arr[ch-'a']++;
        }

        for(char ch:s.toCharArray()){
              arr[ch-'a']--;
        }

        char p=' ';

        for(int i=0;i<arr.length;i++){
            if(arr[i]==1){
                p=(char)(i+'a');
                break;
            }
        }

        return p;
    }
}