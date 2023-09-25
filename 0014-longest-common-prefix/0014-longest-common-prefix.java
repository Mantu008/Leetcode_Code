class Solution {
    public String longestCommonPrefix(String[] strs) {
    String res=strs[0];
     for(int i=1;i<strs.length;i++){
         res=common(res,strs[i]);
     }

     return res;

    }

public static String common(String s1,String s2){
    String res="";
    int n=s1.length()<s2.length()?s1.length():s2.length();
    for(int i=0;i<n;i++){
         if(s1.charAt(i)==s2.charAt(i)){
                 res=res+s1.charAt(i);
         }else{
            break;
         }
    }
      return res;
}

}
