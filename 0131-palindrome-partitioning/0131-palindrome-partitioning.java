class Solution {
    public List<List<String>> partition(String s) {
         ArrayList<String>list=new ArrayList<>();
        List<List<String>> resultList = new ArrayList<>(); 
        int idx=0;
        palindrome_partition(idx,s,list,resultList);

        return resultList;
    
    }

     public static void palindrome_partition(int idx,String s,ArrayList<String>list,List<List<String>> resultList){
         if(idx==s.length()){
             resultList.add(new ArrayList<>(list));
            return;
         }

          for(int i=idx;i<s.length();++i){
            if(isPalindrome(s, idx, i)){
                list.add(s.substring(idx, i+1));
                palindrome_partition(i+1, s, list, resultList);
                list.remove(list.size()-1); 
            }
          }
}


static boolean isPalindrome(String s,int start,int end){
      while(start<=end){
           if(s.charAt(start++)!=s.charAt(end--)){
                   return false;
           }
      }
  return true;
 }

}