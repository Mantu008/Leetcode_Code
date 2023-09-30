class Solution {
    public String getPermutation(int n, int k) {
        ArrayList<Integer>list=new ArrayList<>();
        int fact=1;
        for(int i=1;i<n;i++){
            fact=fact*i;                  //this is for find factriol
            list.add(i);                  //this add all element in list accept last element
        }
        list.add(n);                      //this add the last element in list
        k=k-1;                            //we minuous because we treverceing index(0-17) that is euual to k
        String ans="";                    //this is for storing kth parmutation siquence..

        while(true){
             ans=ans+list.get(k/fact);      //add digit in ans to the given position 
             list.remove(k/fact);           //remove digit from the list because it is taken
             if(list.size()==0){             //when size of list is empty than break this loop
                    break;
             }
             k=k%fact;                      //override k value after each ittration for next range
             fact=fact/list.size();         //override the factrioal value for 
        }

       return ans;

    }
}