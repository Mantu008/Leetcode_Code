class Solution {
    public int firstUniqChar(String s) {


        int[] arr = new int[26];        //creat array of length of 26
        for(int i=0;i<s.length();i++){     //store each charector frequency
           arr[s.charAt(i)-'a']++;            
        }

        for(int i=0;i<s.length();i++){    //check which first charactor frequency is one
              if(arr[s.charAt(i)-'a']==1){
                    return i;
              } 
        }   

     //after traverce each loop here we not found any unique char so return -1  

        return -1;
       

        
        
    }
}
