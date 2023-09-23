class Solution {
    public int firstUniqChar(String s) {

    //     Queue<Character> q = new LinkedList<>();
    //     String str=s;
    //     String str1="";
    //     int p=-1;

    //     for(int i=0;i<str.length();i++){
    //            q.offer(str.charAt(i));
    //     }

    //   while(!q.isEmpty()){
    //       Character c=q.poll(); 
    //         if(q.contains(c)){
    //             while(q.contains(c)){
    //                    q.remove(c);
    //             }
    //         }else{
    //             str1=str1+c;
    //             break;
    //         }
    //   }

 

    //      for(int i=0;i<str.length();i++){
    //         if(str1.length()==1){
    //             if(str.charAt(i)==str1.charAt(0)){
    //                    System.out.println("cherector:"+str.charAt(i));
    //                    System.out.println("index:-"+i);
    //                    p=i;
    //                    break;
    //             }
    //         }
    //      }

    //      if(p==-1){
    //           return -1;
    //      }else{
    //          return p;
    //      }




        int[] arr = new int[26];
        for(int i=0;i<s.length();i++){
           arr[s.charAt(i)-'a']++;
        }

        for(int i=0;i<s.length();i++){
              if(arr[s.charAt(i)-'a']==1){
                    return i;
              } 
        }

        return -1;
       

        
        
    }
}


//  for (int i = 0; i < s.length(); i++) {
//             arr[s.charAt(i) - 'a']++;
//         }

//         for (int i = 0; i < s.length(); i++) {
//             if (arr[s.charAt(i) - 'a'] == 1) return i;
//         }
//         return -1;